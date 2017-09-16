//
//  ViewController.swift
//  Budget
//
//  Created by Thomas Youngson on 13/09/17.
//  Copyright © 2017 Thomas Youngson. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {
    
    //MARK: Properties
    
    @IBOutlet weak var incomeLabel: UILabel!
    @IBOutlet weak var incomeTextField: UITextField!
    
    @IBOutlet weak var rentLabel: UILabel!
    @IBOutlet weak var rentTextField: UITextField!
    
    @IBOutlet weak var foodLabel: UILabel!
    @IBOutlet weak var foodTextField: UITextField!
    
    @IBOutlet weak var fuelLabel: UILabel!
    @IBOutlet weak var fuelTextField: UITextField!
    
    @IBOutlet weak var totalLabel: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()
        
        // Handle the income text field user input through delegate callbacks.
        incomeTextField.delegate = self
        incomeTextField.keyboardType = .numberPad
        
        rentTextField.delegate = self
        rentTextField.keyboardType = .numberPad
        
        foodTextField.delegate = self
        foodTextField.keyboardType = .numberPad
        
        fuelTextField.delegate = self
        fuelTextField.keyboardType = .numberPad
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    //MARK: UITextFieldDelegate
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        // Hide the keyboard.
        textField.resignFirstResponder()
        return true
    }
    
    //MARK: Actions
    
    @IBAction func calculateTotal(_ sender: UIButton) {
        
        var calTotal = Double()
        
        // Only allows numbers to be passed in with defualt of 0.
        let incomeDouble = Double(incomeTextField.text!) ?? 0
        let rentDouble = Double(rentTextField.text!) ?? 0
        let foodDouble = Double(foodTextField.text!) ?? 0
        let fuelDouble = Double(fuelTextField.text!) ?? 0
        
        // Calculates the left over budget.
        calTotal = incomeDouble - (rentDouble + foodDouble + fuelDouble)
        
        totalLabel.text = "$" + String(calTotal)
    }
}

