package de.fw.backend.Controller;

import de.fw.backend.Entity.Ware;
import de.fw.backend.Enum.Direction;
import de.fw.backend.Repository.WareRepository;
import de.fw.backend.Service.WareService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ware")
public class wareController {

    private WareRepository warerepository; //Attribut von dem Warenrepository
    private WareService wareService;

    public wareController(WareRepository warerepository, WareService wareService) {
        this.warerepository = warerepository;
        this.wareService = wareService;
    }


    @GetMapping(path = "/get", produces = "application/json") // HTTP-PFad + Rückgabetyp als JSON String
    public ResponseEntity<List<Ware>> get() {
       return ResponseEntity.ok(wareService.get());
    }


    @GetMapping(path = "/get/{id}", produces = "application/json")
    public ResponseEntity<Ware> getWare(@RequestParam(value = "id", required = true) long id){

        if (wareService.getbyId(id) != null){
            return ResponseEntity.ok(wareService.getbyId(id));
        }
        else {
            return new ResponseEntity<Ware>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping(path = "/create") // HTTP-Pfad
    public ResponseEntity<String> create(@RequestParam(value = "name", required = true) String name,
                                         @RequestParam(value = "anzahl", defaultValue = "0") int anzahl) {

        if(wareService.create(name, anzahl)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping(path = "/delete/{id}") //HTTP-Pfad
    public ResponseEntity<String> deleteWare(@RequestParam(value = "id", required = true) long id){

        if(wareService.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }

    @PatchMapping(path = "/anzahl/add") //HTTP-Pfad
    public ResponseEntity<String> addAnzahl(@RequestParam(value = "id", required = true) long id,
                                            @RequestParam(value = "count", required = true) int count){
        if(wareService.changeCount(id, count, Direction.add)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }

    @PatchMapping(path = "/anzahl/sub")
    public ResponseEntity<String> subAnzahl(@RequestParam(value = "id", required = true) long id,
                                            @RequestParam(value = "count", required = true) int count)
    {
       if(wareService.changeCount(id, count, Direction.sub)){
           return new ResponseEntity<>(HttpStatus.OK);
       }
       else{
           return new ResponseEntity<>(HttpStatus.CONFLICT);
       }
    }


}
