package ru.config;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CatalogController {

    @FXML
    private TableView<?> systemUnitTab;

    @FXML
    private TableColumn<?, ?> idSystemColumn;

    @FXML
    private TableColumn<?, ?> nameSystemColumn;

    @FXML
    private TableColumn<?, ?> motherboardSystemColumn;

    @FXML
    private TableColumn<?, ?> coolerSystemColumn;

    @FXML
    private Button buttonBuySystemUnit;

    @FXML
    private TableView<?> mothderboardTab;

    @FXML
    private TableColumn<?, ?> idMotherboardColumn;

    @FXML
    private TableColumn<?, ?> nameMotherboardColumn;

    @FXML
    private TableColumn<?, ?> chipsetColumn;

    @FXML
    private TableColumn<?, ?> frequencyRamColumn;

    @FXML
    private TableColumn<?, ?> maxRamColumn;

    @FXML
    private TableColumn<?, ?> numberRamSlotsColumn;

    @FXML
    private TableColumn<?, ?> socketColumn;

    @FXML
    private TableColumn<?, ?> formFactorColumn;

    @FXML
    private TableColumn<?, ?> typeRamSystemColumn;

    @FXML
    private TableColumn<?, ?> typePowerColumn;

    @FXML
    private TableColumn<?, ?> brendSystemColumn;

    @FXML
    private TableColumn<?, ?> typeConnectionColumn;

    @FXML
    private TableColumn<?, ?> RamSystemColumn;

    @FXML
    private TableColumn<?, ?> cpuSystemColumn;

    @FXML
    private Button buttonBuyMotherboard;

    @FXML
    private TableView<?> cpuTab;

    @FXML
    private TableColumn<?, ?> idCpuColumn;

    @FXML
    private TableColumn<?, ?> nameCpuColumn;

    @FXML
    private TableColumn<?, ?> brendCpuColumn;

    @FXML
    private Button buttonBuyCPU;

    @FXML
    private Tab ramTab;

    @FXML
    private TableColumn<?, ?> idRamColumn;

    @FXML
    private TableColumn<?, ?> nameRamColumn;

    @FXML
    private TableColumn<?, ?> volumeColumn;

    @FXML
    private TableColumn<?, ?> clockSpeedColumn;

    @FXML
    private TableColumn<?, ?> brendRamColumn;

    @FXML
    private Button buttonBuyRAM;

    @FXML
    private Tab buttonBuyCooler;

    @FXML
    private TableView<?> coolerTab;

    @FXML
    private TableColumn<?, ?> idCoolerColumn;

    @FXML
    private TableColumn<?, ?> nameCoolerColumn;

    @FXML
    private TableColumn<?, ?> brendCoolerColumn;

    @FXML
    void actionBuyCooler(ActionEvent event) {

    }

    @FXML
    void actionBuyCpu(ActionEvent event) {

    }

    @FXML
    void actionBuyMotherboard(ActionEvent event) {

    }

    @FXML
    void actionBuyRAM(ActionEvent event) {

    }

    @FXML
    void actionBuySystemUnit(ActionEvent event) {

    }

}
