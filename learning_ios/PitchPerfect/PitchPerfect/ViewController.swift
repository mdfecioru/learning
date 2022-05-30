//
//  ViewController.swift
//  PitchPerfect
//
//  Created by David Fecioru on 5/30/22.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var recordLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func recordAudio(_ sender: Any) {
        recordLabel.text = "Record button was clicked!"
    }
    
    
    @IBAction func stopAudio(_ sender: Any) {
        recordLabel.text = "STOP button was clicked!"
    }
    
}

