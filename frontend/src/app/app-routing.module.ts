
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components';
import { CarPageComponent } from './components/pages/car-page/car-page.component'
import { LoginFormComponent } from './login-form/login-form.component';
import { SpecialsComponent } from './specials/specials.component';
import { ContactComponent } from './contact/contact.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {
    path: 'home', component: HomeComponent
  },
  {
    path: 'about', component: CarPageComponent
  },
  {
    path: 'login', component: LoginFormComponent
  },
  {
    path: 'specials', component: SpecialsComponent
  },
  {
    path: 'contact', component: ContactComponent
  }

  // otherwise redirect to home
  // { path: '**', redirectTo: '/' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
