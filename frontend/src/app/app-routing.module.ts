
import { NgModule } from '@angular/core';

import { RouterModule , Routes} from '@angular/router';
import { HomeComponent } from './components';
import { CarPageComponent } from './components/pages/car-page/car-page.component'
import { LoginFormComponent } from './login-form/login-form.component';
import { SpecialsComponent } from './specials/specials.component';
import { ContactComponent } from './contact/contact.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {
    path: 'home', component: HomeComponent
  },
  {
    path: 'about', component: AboutComponent
  },
  {
    path: 'specials', component: SpecialsComponent
  },
  {
    path: 'contact', component: ContactComponent
  },
  {
    path: 'login', component: LoginComponent
  },
  

  // otherwise redirect to home
  // { path: '**', redirectTo: '/' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
