# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'ui\loginwindow.ui'
#
# Created by: PyQt5 UI code generator 5.15.5
#
# WARNING: Any manual changes made to this file will be lost when pyuic5 is
# run again.  Do not edit this file unless you know what you are doing.


from PyQt5 import QtCore, QtGui, QtWidgets


class Ui_LoginWindow(object):
    def setupUi(self, LoginWindow):
        LoginWindow.setObjectName("LoginWindow")
        LoginWindow.resize(640, 440)
        LoginWindow.setStyleSheet("background-color: rgb(195, 0, 0);")
        self.centralwidget = QtWidgets.QWidget(LoginWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.label = QtWidgets.QLabel(self.centralwidget)
        self.label.setGeometry(QtCore.QRect(30, 40, 571, 121))
        font = QtGui.QFont()
        font.setPointSize(18)
        self.label.setFont(font)
        self.label.setObjectName("label")
        self.btnLogin = QtWidgets.QPushButton(self.centralwidget)
        self.btnLogin.setGeometry(QtCore.QRect(90, 290, 451, 51))
        self.btnLogin.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.btnLogin.setObjectName("btnLogin")
        self.label_2 = QtWidgets.QLabel(self.centralwidget)
        self.label_2.setGeometry(QtCore.QRect(90, 210, 121, 31))
        font = QtGui.QFont()
        font.setPointSize(10)
        self.label_2.setFont(font)
        self.label_2.setObjectName("label_2")
        self.txfID = QtWidgets.QTextBrowser(self.centralwidget)
        self.txfID.setGeometry(QtCore.QRect(220, 210, 221, 41))
        self.txfID.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.txfID.setObjectName("txfID")
        LoginWindow.setCentralWidget(self.centralwidget)
        self.statusbar = QtWidgets.QStatusBar(LoginWindow)
        self.statusbar.setObjectName("statusbar")
        LoginWindow.setStatusBar(self.statusbar)

        self.retranslateUi(LoginWindow)
        QtCore.QMetaObject.connectSlotsByName(LoginWindow)

    def retranslateUi(self, LoginWindow):
        _translate = QtCore.QCoreApplication.translate
        LoginWindow.setWindowTitle(_translate("LoginWindow", "MainWindow"))
        self.label.setText(_translate("LoginWindow", "Kassensystem - Zum Anmelden RFID-Chip vorhalten"))
        self.btnLogin.setText(_translate("LoginWindow", "Login"))
        self.label_2.setText(_translate("LoginWindow", "RFID-CHIP ID: "))
