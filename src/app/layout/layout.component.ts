import { Component } from '@angular/core';
import {NbMenuItem} from "@nebular/theme";

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.scss']
})
export class LayoutComponent {
  items: NbMenuItem[] = [
    {
      title: 'Années Scolaires',
      icon: 'calendar-outline',
      url: '/year'
    },
    {
      title: 'Classes',
      icon: 'map-outline',
      url: '/classe',
    },
    {
      title: 'Professeurs',
      icon: 'people-outline',
      url: '/professeurs'
    },
    {
      title: 'Semestres',
      icon: 'file-outline',
      url: '/semestres'
    },
    {
      title: 'Modules',
      icon: 'bookmark-outline',
      url: '/modules'
    },
    {
      title: 'Etudiants',
      icon: 'people-outline',
      url: '/students'
    },
    {
      title: 'Cours',
      icon: 'book-open-outline',
      url: '/courses'
    },
    {
      title: 'Salles',
      icon: 'pin-outline',
      url: '/salles'
    },
    {
      title: 'Sessions de Cours',
      icon: 'tv',
      url: '/sessions'
    },
  ];
}
