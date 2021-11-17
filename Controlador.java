//Controlador (Controller): Este componente es el que responde a la interacción (eventos) que hace el usuario en la interfaz//
//y realiza las peticiones al modelo para pasar estos a la vista.//

public class Controlador {

    public static void main(String[] args) {
        Vista v = new Vista();
        int index_radio = 0;
        int index_accion1 = 0;
        int index_accion2 = 0;
        index_radio = v.menu_tipo();

        if (index_radio == 1) {
            Radio radio = new Radio();
            System.out.println(radio);
            while (index_accion1 != 6) {
                index_accion1 = v.menu_p(radio);
                if (index_accion1 == 1) {
                    radio.setModo("Normal");
                    radio.turn();
                    System.out.println(radio);

                } else if (index_accion1 == 2 && radio.isTurn()) {
                    radio.setModo("Normal");
                    radio.vol(v.menu_vol());
                    System.out.println(radio);

                } else if (index_accion1 == 3 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Radio");
                    while (index_accion2 != 5) {
                        index_accion2 = v.menu_r();

                        if (index_accion2 == 1) {
                            radio.Switch();
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarEmisora(v.menu_emi());
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.guardarEmisora(v.nombre_emisora());
                            System.out.println(radio);

                        } else if (index_accion2 == 4) {
                            radio.cargarEmisora(v);
                            System.out.println(radio);
                        }

                    }
                } else if (index_accion1 == 4 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Reproduccion");
                    while (index_accion2 != 4) {
                        index_accion2 = v.menu_re();

                        if (index_accion2 == 1) {
                            radio.seleccionarLista(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarCancion(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.escucharCancion(v);
                            System.out.println(radio);
                        }
                    }

                } else if (index_accion1 == 5 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Telefono");
                    while (index_accion2 != 5) {
                        index_accion2 = v.menu_t(radio);

                        if (index_accion2 == 1) {
                            radio.conec_desconec();
                            System.out.println(radio);
                        } else if (index_accion2 == 2) {
                            radio.mostrarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 3) {
                            radio.llamarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 4) {
                            radio.finC();
                            System.out.println(radio);
                        }
                    }
                }
            }
        }

        if (index_radio == 2) {
            RadioA radio = new RadioA();
            System.out.println(radio);
            while (index_accion1 != 7) {
                index_accion1 = v.menu_p(radio);
                if (index_accion1 == 1) {
                    radio.setModo("Normal");
                    radio.turn();
                    System.out.println(radio);

                } else if (index_accion1 == 2 && radio.isTurn()) {
                    radio.setModo("Normal");
                    radio.vol(v.menu_vol());
                    System.out.println(radio);

                } else if (index_accion1 == 3 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Radio");
                    while (index_accion2 != 5) {
                        index_accion2 = v.menu_r();

                        if (index_accion2 == 1) {
                            radio.Switch();
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarEmisora(v.menu_emi());
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.guardarEmisora(v.nombre_emisora());
                            System.out.println(radio);

                        } else if (index_accion2 == 4) {
                            radio.cargarEmisora(v);
                            System.out.println(radio);
                        }

                    }
                } else if (index_accion1 == 4 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Reproduccion");
                    while (index_accion2 != 4) {
                        index_accion2 = v.menu_re();

                        if (index_accion2 == 1) {
                            radio.seleccionarLista(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarCancion(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.escucharCancion(v);
                            System.out.println(radio);
                        }
                    }

                } else if (index_accion1 == 5 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Telefono");
                    while (index_accion2 != 6) {
                        index_accion2 = v.menu_t(radio);

                        if (index_accion2 == 1) {
                            radio.conec_desconec();
                            System.out.println(radio);
                        } else if (index_accion2 == 2) {
                            radio.mostrarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 3) {
                            radio.llamarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 4) {
                            radio.finC();
                            System.out.println(radio);
                        } else if (index_accion2 == 5) {
                            radio.llam_ult();
                            System.out.println(radio);
                        }
                    }
                } else if (index_accion1 == 6 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Productividad");
                    while (index_accion2 != 2) {
                        index_accion2 = v.menu_pro(radio);

                        if (index_accion2 == 1) {
                            radio.tarjetas(v);
                            System.out.println(radio);
                        }
                    }
                }
            }
        }

        if (index_radio == 3) {
            RadioS radio = new RadioS();
            System.out.println(radio);
            while (index_accion1 != 7) {
                index_accion1 = v.menu_p(radio);
                if (index_accion1 == 1) {
                    radio.setModo("Normal");
                    radio.turn();
                    System.out.println(radio);

                } else if (index_accion1 == 2 && radio.isTurn()) {
                    radio.setModo("Normal");
                    radio.vol(v.menu_vol());
                    System.out.println(radio);

                } else if (index_accion1 == 3 && radio.isTurn()) {
                    radio.setModo("Radio");
                    index_accion2 = 0;
                    while (index_accion2 != 5) {
                        index_accion2 = v.menu_r();

                        if (index_accion2 == 1) {
                            radio.Switch();
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarEmisora(v.menu_emi());
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.guardarEmisora(v.nombre_emisora());
                            System.out.println(radio);

                        } else if (index_accion2 == 4) {
                            radio.cargarEmisora(v);
                            System.out.println(radio);
                        }

                    }
                } else if (index_accion1 == 4 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Reproduccion");
                    while (index_accion2 != 4) {
                        index_accion2 = v.menu_re();

                        if (index_accion2 == 1) {
                            radio.seleccionarLista(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarCancion(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.escucharCancion(v);
                            System.out.println(radio);
                        }
                    }

                } else if (index_accion1 == 5 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Telefono");
                    while (index_accion2 != 6) {
                        index_accion2 = v.menu_t(radio);

                        if (index_accion2 == 1) {
                            radio.conec_desconec();
                            System.out.println(radio);
                        } else if (index_accion2 == 2) {
                            radio.mostrarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 3) {
                            radio.llamarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 4) {
                            radio.finC();
                            System.out.println(radio);
                        } else if (index_accion2 == 5) {
                            radio.switch_bocinas();
                            System.out.println(radio);
                        }
                    }
                } else if (index_accion1 == 6 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Productividad");
                    while (index_accion2 != 2) {
                        index_accion2 = v.menu_pro(radio);

                        if (index_accion2 == 1) {
                            radio.planificar(v);
                            System.out.println(radio);
                        }
                    }
                }
            }
        }
        if (index_radio == 4) {
            RadioC radio = new RadioC();
            System.out.println(radio);
            while (index_accion1 != 7) {
                index_accion1 = v.menu_p(radio);
                if (index_accion1 == 1) {
                    radio.setModo("Normal");
                    radio.turn();
                    System.out.println(radio);

                } else if (index_accion1 == 2 && radio.isTurn()) {
                    radio.setModo("Normal");
                    radio.vol(v.menu_vol());
                    System.out.println(radio);

                } else if (index_accion1 == 3 && radio.isTurn()) {
                    radio.setModo("Radio");
                    index_accion2 = 0;
                    while (index_accion2 != 5) {
                        index_accion2 = v.menu_r();

                        if (index_accion2 == 1) {
                            radio.Switch();
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarEmisora(v.menu_emi());
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.guardarEmisora(v.nombre_emisora());
                            System.out.println(radio);

                        } else if (index_accion2 == 4) {
                            radio.cargarEmisora(v);
                            System.out.println(radio);
                        }

                    }
                } else if (index_accion1 == 4 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Reproduccion");
                    while (index_accion2 != 4) {
                        index_accion2 = v.menu_re();

                        if (index_accion2 == 1) {
                            radio.seleccionarLista(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 2) {
                            radio.cambiarCancion(v);
                            System.out.println(radio);

                        } else if (index_accion2 == 3) {
                            radio.escucharCancion(v);
                            System.out.println(radio);
                        }
                    }

                } else if (index_accion1 == 5 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Telefono");
                    while (index_accion2 != 6) {
                        index_accion2 = v.menu_t(radio);

                        if (index_accion2 == 1) {
                            radio.conec_desconec();
                            System.out.println(radio);
                        } else if (index_accion2 == 2) {
                            radio.mostrarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 3) {
                            radio.llamarC(v);
                            System.out.println(radio);
                        } else if (index_accion2 == 4) {
                            radio.finC();
                            System.out.println(radio);
                        } else if (index_accion2 == 5) {
                            radio.espera();
                            System.out.println(radio);
                        }
                    }
                } else if (index_accion1 == 6 && radio.isTurn()) {
                    index_accion2 = 0;
                    radio.setModo("Productividad");
                    while (index_accion2 != 2) {
                        index_accion2 = v.menu_pro(radio);

                        if (index_accion2 == 1) {
                            radio.pronostico();
                            System.out.println(radio);
                        }
                    }
                }
            }
        }

    }
}
