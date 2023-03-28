import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  //declare formgroup variables
  loginForm: FormGroup;

  //declare boolean variable to get form submitted or not
  submitted: boolean = false;

  //inject formbuilder dependency to create form with validatord
  constructor(private builder: FormBuilder) {}

  ngOnInit(): void {
    this.loginForm = this.builder.group({
      email: ['', [Validators.required, Validators.email]],

      password: ['', [Validators.required, Validators.minLength(8)]],
    });
  }

  //when user will check click on submit button method will be called
  OnSubmit() {
    this.submitted = true;
    if (this.loginForm.invalid) return;
    else alert('Login successfully');
  }

  //To access the form control in a view to display the error
  get f() {
    return this.loginForm.controls;
  }
}