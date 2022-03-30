package com.mischief247.ffrpgmonstermaker;

import com.mischief247.ffrpgmonstermaker.data.Monster;
import com.mischief247.ffrpgmonstermaker.data.abilities.Attack;
import com.mischief247.ffrpgmonstermaker.data.abilities.SimpleAbilities;
import com.mischief247.ffrpgmonstermaker.data.monsters.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import static javafx.scene.control.SelectionMode.*;

public class MonsterMakerController {
    Monster monster = new Monster();

    @FXML
    Spinner<Integer> levelSpinner;
    @FXML
    Spinner<Integer> strengthSpinner;
    @FXML
    Spinner<Integer> vitalitySpinner;
    @FXML
    Spinner<Integer> agilitySpinner;
    @FXML
    Spinner<Integer> speedSpinner;
    @FXML
    Spinner<Integer> magicSpinner;
    @FXML
    Spinner<Integer> spiritSpinner;

    @FXML
    Label remainingPointsLabel;

    @FXML
    ComboBox<MonsterCategory> monsterCategoryComboBox;
    @FXML
    ComboBox<IntelligenceClass> intelligenceClassComboBox;
    @FXML
    ComboBox<MonsterType> monsterTypeComboBox;
    @FXML
    ComboBox<HpBase> hpBaseComboBox;
    @FXML
    ComboBox<MpBase> mpBaseComboBox;
    @FXML
    ComboBox<ArmorBase> armorBaseComboBox;
    @FXML
    ComboBox<MagicArmorBase> mArmorBaseComboBox;

    @FXML
    Button addButton ;
    @FXML
    Button removeButton;
    @FXML
    Button addAttackButton;
    @FXML
    Button newAttackButton;
    @FXML
    Button removeAttackButton;



    @FXML
    ListView<SimpleAbilities> simpleAttackList;
    @FXML
    ListView<SimpleAbilities> monsterSimpleAttackList;
    @FXML
    ListView<Attack> monsterComplexAttackList;

    @FXML
    MenuBar monsterMenuBar;

    private final ChangeListener<Integer> updateListener = new ChangeListener<Integer>() {
        @Override
        public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
            updateMonster();
        }
    };


    @FXML
    public void initialize(){
        initLists();
        initSpinners();
        initComboBoxes();
        updateMonster();

        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                simpleAttackList.getSelectionModel().getSelectedItems();
            }
        });
        removeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }
    private void initLists(){
        simpleAttackList.getItems().addAll(SimpleAbilities.values());
        simpleAttackList.getSelectionModel().setSelectionMode(MULTIPLE);
    }
    private void initSpinners(){
        //initialize spinner Value factories
        levelSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,1));
        strengthSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1));
        vitalitySpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1));
        agilitySpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1));
        speedSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1));
        magicSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1));
        spiritSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,30,1));

        //initialize spinner change listeners
        levelSpinner.valueProperty().addListener(updateListener);
        strengthSpinner.valueProperty().addListener(updateListener);
        vitalitySpinner.valueProperty().addListener(updateListener);
        agilitySpinner.valueProperty().addListener(updateListener);
        speedSpinner.valueProperty().addListener(updateListener);
        magicSpinner.valueProperty().addListener(updateListener);
        spiritSpinner.valueProperty().addListener(updateListener);

    }
    public void  initComboBoxes(){
        //populate combo boxes with their contents
        monsterCategoryComboBox.getItems().addAll(MonsterCategory.values());
        intelligenceClassComboBox.getItems().addAll(IntelligenceClass.values());
        monsterTypeComboBox.getItems().addAll(MonsterType.values());
        hpBaseComboBox.getItems().addAll(HpBase.values());
        mpBaseComboBox.getItems().addAll(MpBase.values());
        armorBaseComboBox.getItems().addAll(ArmorBase.values());
        mArmorBaseComboBox.getItems().addAll(MagicArmorBase.values());
    }
    private void updateMonster(){
        //update the backing monster class and update the remaining points label
        monster.setLevel(levelSpinner.getValue());
        monster.setStr(strengthSpinner.getValue());
        monster.setVit(vitalitySpinner.getValue());
        monster.setAgi(agilitySpinner.getValue());
        monster.setSpd(speedSpinner.getValue());
        monster.setMag(magicSpinner.getValue());
        monster.setSpr(spiritSpinner.getValue());
        remainingPointsLabel.setText(String.valueOf((35+levelSpinner.getValue())- (int)monster.getStatTotal()));
    }

}