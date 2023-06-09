import { Routes } from "@angular/router";
import { LayoutComponent } from "./layout/layout.component";

export const routes: Routes = [
  {
    path:'',
    component: LayoutComponent,
    children:[
      {
        path:'',
        loadChildren: () => import('./pages/salles/salles.module').then(m => m.SallesModule ),
      },
      {
        path:'classe',
        loadChildren: () => import('./pages/classe/classe.module').then(m => m.ClasseModule ),
      },
      {
        path:'modules',
        loadChildren: () => import('./pages/modules/modules.module').then(m => m.ModulesModule),
      },
      {
        path:'professeurs',
        loadChildren: () => import('./pages/professeurs/professeurs.module').then(m => m.ProfesseursModule ),
      },
      {
        path:'courses',
        loadChildren: () => import('./pages/courses/courses.module').then(m => m.CoursesModule ),
      },
      {
        path:'semestres',
        loadChildren: () => import('./pages/semestres/semestres.module').then(m => m.SemestresModule ),
      },
      {
        path:'year',
        loadChildren: () => import('./pages/year/year.module').then(m => m.YearModule ),
      },
      {
        path:'sessions',
        loadChildren: () => import('./pages/sessions/sessions.module').then(m => m.SessionsModule ),
      },
      {
        path:'student',
        loadChildren: () => import('./pages/student/student.module').then(m => m.StudentModule ),
      }
    ]

  }
];
