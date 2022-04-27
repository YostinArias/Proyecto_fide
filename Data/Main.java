package Data;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int pin = Integer.parseInt(JOptionPane.showInputDialog("Digite el pin"));
        if (pin==123){
            Scanner sn = new Scanner(System.in);

            boolean salir = false;
            int opcion;

            while (!salir) {
                System.out.println("1.Deduccion de su salario");
                System.out.println("2.Inconformidades en la empresa");
                System.out.println("3.Calendario de la empresa");
                System.out.println("4.Instrucciones");
                System.out.println("5.Recursos humanos");
                System.out.println("6.Reglamento de la empresa");
                System.out.println("7.SALIR");
                System.out.println();
                try {
                    System.out.println("Introduce un numero:");
                    opcion = sn.nextByte();

                    switch (opcion) {
                        case 1:
                            Salario elSalario = new Salario();
                            elSalario.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
                            elSalario.setTelefono(JOptionPane.showInputDialog("Digite Su telefono"));
                            elSalario.setPuesto(JOptionPane.showInputDialog("Digite el puesto en la empresa"));
                            System.out.println("Deduciones");

                            elSalario.setSalariobruto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Salario Mensual")));
                            System.out.println("Sus deduciones Mensuales son las siguientes:");
                            System.out.println("Seguro de Salud, Caja Costarricense de Seguro Social (C.C.S.S.):8% de su Salario.");
                            System.out.println("Seguro de Pensiones Invalidez, Vejez y Muerte:12% de su Salario.");
                            System.out.println("Impuestos Municipales:5% de su Salario.");
                            System.out.println("SU salario Bruto es de :" + elSalario.getSalariobruto());

                            double seguroSalud = elSalario.getSalariobruto()*0.08/100;
                            double impuestosmunicipales = elSalario.getSalariobruto()*0.5/100;
                            double seguropensiones = elSalario.getSalariobruto()*0.12/100;
                            double total = elSalario.getSalariobruto()-seguropensiones-seguroSalud-impuestosmunicipales;
                            System.out.println("SU salario Neto es de :" + total);
                            System.out.println();

                            break;
                        case 2:
                            Pregunta lapregunta = new Pregunta();
                            lapregunta.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
                            lapregunta.setTelefono(JOptionPane.showInputDialog("Digite Su telefono"));
                            lapregunta.setPuesto(JOptionPane.showInputDialog("Digite el puesto en la empresa"));
                            System.out.println("Inconformidades");
                            System.out.println("Acontintuación conteste las siguientes preguntas sobre su Trabajo");
                            System.out.println("1.Cómo es su ambiente laboral:");
                            System.out.println("1.Bueno,me gusta donde trabajo  2.Regular,me funciona  3.Muy Malo no me siento comodo");
                            lapregunta.setpregunta1( String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Digite su Respuesta "))));
                            System.out.println("1.Se siente Conforme con su Horario");
                            System.out.println("1.Si,es muy Flexible  2.No,se pasa del Horario estimado");
                            lapregunta.setpregunta2( String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Digite su Respuesta "))));
                            System.out.println("1.Su salario corresponde al Salario dado Inicialmente cuando fue contratado");
                            System.out.println("1.Si,es el estimado desde el Inicio  2.No,no corresponde al salario establecido desde el Inicio");
                            lapregunta.setpregunta3( String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Digite su Respuesta "))));
                            System.out.println("1.Se le da los descansos necesarios");
                            System.out.println("1.Si,el descanso es suficiente  2.No,no me dan descanso");
                            lapregunta.setpregunta4( String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Digite su Respuesta "))));
                            System.out.println("1.La empresa le da lo que necesita para realizar su Labor");
                            System.out.println("1.Si hay materiales suficientes para Realizar el Trabajo 2.No hay materiales para realizar los Trabajos");
                            lapregunta.setpregunta5(String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Digite su Respuesta "))));
                            break;
                        case 3:
                            Calendario elCalendario = new Calendario();
                            elCalendario.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
                            elCalendario.setTelefono(JOptionPane.showInputDialog("Digite Su telefono"));
                            elCalendario.setPuesto(JOptionPane.showInputDialog("Digite el puesto en la empresa"));
                            System.out.println("4.Mes junio");
                            System.out.println("3.Mes mayo");
                            System.out.println("1.Mes abril");
                            System.out.println("2.Mes marzo");

                            System.out.println();
                            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes en el que desea consultar"));
                            if (opcion1 == 1) {
                                JOptionPane.showMessageDialog(null, "AVISO IMPORTANTE: LEER ANTES DE APRETAR EL BOTON /ok/ ya que seran avisos *IMPORTANTES* para el proximo mes");
                                JOptionPane.showMessageDialog(null, " viernes 1 de abril:Los empleados tienen feriado debido a mantenimiento de los dispositivos de tranajo ");
                                JOptionPane.showMessageDialog(null, "Lunes 11 de abril:Feriado debido a la batalla de rivas");
                                JOptionPane.showMessageDialog(null, "Jueves 14 y viernes 15 de abril:Feriado debido a jueves santo y viernes santo");
                                JOptionPane.showMessageDialog(null, "Martes 24 de abril: la emrpesa organizara una actividad reuniendo a todos sus empleados,cordinadores y gerentes");
                            } else if (opcion1 == 2) {
                                JOptionPane.showMessageDialog(null, "AVISO IMPORTANTE: LEER ANTES DE APRETAR EL BOTON /ok/ ya que seran avisos *IMPORTANTES* para el proximo mes");
                                JOptionPane.showMessageDialog(null, "Viernes 29 de abril: todos los empleadoa iniciaran las horas laborales apartir de las 12 del medio dia debido a que fumigaran las oficinas");
                                JOptionPane.showMessageDialog(null, "Martes 10 de marzo:La empresa organizara una recolecta voluntaria de biberes para familias de escazos recursos");
                                JOptionPane.showMessageDialog(null, "Miercoles 18 de maarzo:Dia libre debido a mantenimiento de los equipos de la empresa");
                                JOptionPane.showMessageDialog(null, "Lunes 23 de marzo se inicia el dia laboral a partir de las 10 a.m");
                                JOptionPane.showMessageDialog(null, "viernes 27 de marzo el trabajo se realizara de manera virtual");
                            }
                            else if(opcion1 == 3){
                                JOptionPane.showMessageDialog(null, "AVISO IMPORTANTE: LEER ANTES DE APRETAR EL BOTON /ok/ ya que seran avisos *IMPORTANTES* para el proximo mes");
                                JOptionPane.showMessageDialog(null, "En este mes se cumpliran las horas laboarales de manera normal sin ningun cambio");
                            }
                            else if (opcion1 == 4){
                                JOptionPane.showMessageDialog(null, "AVISO IMPORTANTE: LEER ANTES DE APRETAR EL BOTON /ok/ ya que seran avisos *IMPORTANTES* para el proximo mes");
                                JOptionPane.showMessageDialog(null, "Miercoles 1 de junio:se celebra el aniversario de la empresa por lo cual se ingresaran a las horas lavorales a las 12 del medio dia y se saldran a las 5 pm despues para los que gusten ir se organizo una actividad en el salon comunal de sanrto tomas");
                                JOptionPane.showMessageDialog(null, "jueves 2 de junio:Dia libre");
                                JOptionPane.showMessageDialog(null, "Domingo 19 de junio:Dia del padre por lo cual se dara libre a todos los empleados");
                                JOptionPane.showMessageDialog(null, "Lunes 27 de junio:Se realizara mantenimiento a los equipos de la empresa por lo cual las horas laborales se realizaran de manera virtual");
                            }
                            break;
                        case 4:
                            Instrucciones laInstruccion = new Instrucciones();
                            laInstruccion.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
                            laInstruccion.setTelefono(JOptionPane.showInputDialog("Digite Su telefono"));
                            laInstruccion.setPuesto(JOptionPane.showInputDialog("Digite el puesto en la empresa"));
                            JOptionPane.showMessageDialog(null, "En este apartado se daran instrucciones a los empleados nuevos");
                            JOptionPane.showMessageDialog(null, "1*Es obligatorio pasar la tarjeta a la hora de entrar a la empresa para llevar un conteo de las horas laborales y de esa manera pagar salarios el que no capte esta instruccion no se le paga las horas de trabajo ");
                            JOptionPane.showMessageDialog(null, "2*La empresa es muy estricta con el codigo de vestimenta no se debe utilizar ropa muy extravagante o provocativa tampoco se debe de utilizar ropa deportiva ya que la imagen de los empleados de la empresa es importante");
                            JOptionPane.showMessageDialog(null, "3*Evitar el conflivto entre los empleados ya que la empresa no tolera las agresiones verbales ni fisicas");
                            JOptionPane.showMessageDialog(null, "4*Si se siente desorientado en los primeros dias de la empresa consultar con el gerente de su sector sus dudas si no le quedan claro por medio de esta APP, el gerente estara en la obligacion de aclarar dichas dudas");
                            JOptionPane.showMessageDialog(null, "5*En caso de salir en ermengencia de la empresa salir en orden sin crear disturbio mantener la calma y esperar ordenes de la persona encargada por favor cumplir con esta instruccion por su seguridad ");
                            JOptionPane.showMessageDialog(null, "6*Encaso de no resivir el salario que le correnponte ir al apartado de quejas en la opcion **2**");
                            break;
                        case 5:
                            boolean salir2 = false;
                            int opcion2;

                            while(!salir2) {
                                System.out.println("1.¡VACANTES!");
                                System.out.println("2.METAS-EMPLEADOS");
                                System.out.println("3.DATOS DE RECURSOS HUMANOS");
                                System.out.println("4.POSTULAR UNA VACANTE");
                                System.out.println("5.SALIR");
                                System.out.println("");

                                try {

                                    System.out.println("Introduce un numero:");
                                    opcion2 = sn.nextByte();

                                    switch (opcion2) {
                                        case 1 -> {
                                            System.out.println("VACANTES DISPONIBLES \n");
                                            System.out.println(" \n");
                                            System.out.println("Para todas las vacantes disponibles, se requiere un nivel de ingles avanzado con un minimo de 2 años de experiencia. \n");
                                            System.out.println("La comprobacion de su nivel de ingles se realizara por medio de un examen en dicha institucion, en la hora y fecha que se le indique. \n");
                                            System.out.println(" \n");
                                            System.out.println("ESPECIALISTA EN REDES: \n");
                                            System.out.println("Se requiere titulo de licenciatura en: ing. Sistemas/ ing. Informatica, Especialista en Redes. \n");
                                            System.out.println("TELECOMUNICACIONES: \n");
                                            System.out.println("Se requiere titulo en Telecomunicaciones. \n");
                                            System.out.println("MARKETING DIGITAL: \n");
                                            System.out.println("Se requiere titulo de Especialista en Marketing digital. \n");
                                            System.out.println("COMERCIO INTERNACIONAL: \n");
                                            System.out.println("Se requiere titulo de Licenciatura en Comercio Internacional. \n");
                                            System.out.println(" \n");
                                        }
                                        case 2 -> {
                                            System.out.println("METAS-EMPLEADO \n");

                                            System.out.println("Promocionar e impulsar el desarrollo de conocimientos por medio de capacitaciones cada periodo de tiempo.\n");

                                            System.out.println("Promover un ambiente laboral adecuado, buscando la comodidad del empleado por medio de una evalucion.\n");

                                            System.out.println("Brindar un trato integro a los empleados. \n");

                                            System.out.println("Mantener la las instalaciones optimas para el desarrollo del empleado. \n");
                                            System.out.println(" \n");

                                        }

                                        case 3 -> {
                                            System.out.println("DATOS DEL AGENTE DE RECURSOS HUMANOS \n");
                                            System.out.println(" \n");
                                            System.out.println("Laura Sanchez Rodriguez \n");
                                            System.out.println("88356012 \n");
                                            System.out.println("82845609 \n");
                                            System.out.println("recursosh@gmail.com \n");
                                            System.out.println("recursosadm@gmail.com \n");
                                            System.out.println(" \n");
                                        }

                                        case 4 -> {

                                            System.out.println("Ingrese sus datos");
                                            Inf_v laInf = new Inf_v();


                                            laInf.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
                                            laInf.setApellido1(JOptionPane.showInputDialog("Ingrese su primer apellido"));
                                            laInf.setApellido2(JOptionPane.showInputDialog("Ingrese su segundo apellido"));
                                            laInf.setPuesto(JOptionPane.showInputDialog("Ingrese el nombre del puesto a postularse"));
                                            laInf.setCorreo_p(JOptionPane.showInputDialog("Ingrese su correo electronico"));


                                                System.out.println(laInf.getNombre());
                                                System.out.println(laInf.getApellido1());
                                                System.out.println(laInf.getApellido2());
                                                System.out.println(laInf.getPuesto());
                                                System.out.println(laInf.getCorreo_p());

                                        }
                                        case 5 -> salir2 = true;
                                        default -> System.out.println("Las opciones son entre 1 y 5 ");
                                    }
                                    System.out.println("Fin del menu");
                                } catch(InputMismatchException e){
                                    System.out.println("Debes escribir un numero");
                                    sn.next();

                                }

                            }
                            break;
                        case 6:
                            Scanner sn3 = new Scanner (System.in);

                            boolean salir3 = false;
                            int opcion3;

                            while(!salir3) {
                                System.out.println("1.REGLAMENTO DEL CALL CENTER");
                                System.out.println("2.REGLAMENTO INTERNO DEL CALL CENTER");
                                System.out.println("3.NORMAS RELATIVAS");
                                System.out.println("4.NORMAS RELATIVAS A CONDUCTA Y COMPORTAMIENTO");
                                System.out.println("5.NORMAS RELATIVAS A LA PRESENTACIÓN PERSONAL");
                                System.out.println("6.NORMAS DE SEGURIDAD");
                                System.out.println("7.QUEJAS DE FALTA AL REGLAMENTO");
                                System.out.println("8.SALIR");
                                System.out.println("");
                                try {

                                    System.out.println("Introduce un numero:");
                                    opcion = sn.nextByte();

                                    switch (opcion) {
                                        case 1 -> {
                                            System.out.println("Esta es la opcion 1 \n");
                                            System.out.print("REGLAMENTO \n");

                                            System.out.println("REGLAMENTO DEL CALL CENTER \n" );

                                            System.out.print(" Todos los funcionarios de la compaña que requieren utilizar los recursos tecnologicos, informaticos y fisicos correspondientes al Call Center durante su labor diaria y de forma permanente.  \n");

                                            System.out.print("OBEJTIVOS: \n");

                                            System.out.print("Describir las normas requeridas para proteger la seguridad de la informacion en el area de Call Center.  \n");

                                            System.out.print("Informar las poloticas, norma de convivencia ousuarios deben dar los recursos del Call.  \n");

                                            System.out.print("Center asi como tambien sus resnonsabilidades en cuanto a la utilizacion de las mismas.  \n");

                                            System.out.print("RESPONSABLES DE SU APLICACION: \n");

                                            System.out.print("Los directores de los departamentos  de Gestion Humana y Control Interno y Tecnologi­a, quienes durante los procesos de revision e inspeccion de la funcion del area de Call Center, \n");
                                            System.out.print("son los responsables de aplicar el regimen sancionatorio y disciplinario inmediatamente detecta cualquier incumplimiento a la normatividad descrita en el presente documento, por lo cual deben diligenciar el formato de inspeccion dispuesto para tal fin. \n");
                                        }

                                        case 2 -> {
                                            System.out.println("Esta es la opcion 2 \n");
                                            System.out.print("REGLAMENTO INTERNO DEL CALL CENTER: \n");

                                            System.out.print("1.    De acuerdo a la naturaleza del servicio otorgado por el area de Contact Center quien ofrece servicios continuos durante las 24 horas los 365 todos los di­as del año, sera facultad de la Empresa el determinar los di­as de descanso aplicables para cada Colaborador del CC, de tal forma que se asegure el servicio en forma regular y constante. \n");

                                            System.out.print("2.    El Colaborador debera cubrir los horarios que determine la Empresa conforme a las necesidades del Servicio, la Empresa estara facultada para rotar a los Colaboradores con el proposito \n");
                                            System.out.print(" de que estos cubran diferentes horarios y turnos, para garantizar el servicio las 24 horas de los 365 di­as del año.");

                                            System.out.print("3.    Los Colaboradores deberan firmar personalmente todos los di­as de labores su entrada y salida en los registros y controles de asistencia que para tal efecto determine la Empresa. Los cuales serviran de fuente de informacion para la aplicacion de incidencias. \n");

                                            System.out.print("4.     El Colaborador esta obligado a desempeñar sus funciones en el(los) lugar(es) indicados por la Empresa, quien podra modificarlos de acuerdo a la necesidad de la operacion del Contact. \n");

                                            System.out.print("5.    El Colaborador tiene la obligacion de presentarse puntualmente a sus labores en el horario establecido por la Empresa, de llegar con retraso se hara acreedor a las sanciones correspondientes que determine la Empresa; cuando el retraso sea mayor a 10 minutos, tomando en consideracion las circunstancias que lo propiciaron, ");
                                            System.out.print("la Empresa esta facultada para rehusarse a admitir el ingreso del Colaborador y su falta sera considerada como injustificada para todos los efectos legales. \n");

                                            System.out.print("6.    Cuando por causas de fuerza mayor el Colaborador no pueda asistir a sus labores, tendra la obligacion de avisar con 24 hrs. mi­nimo de anticipacion, salvo los casos que por su naturaleza se lo impidan, para los cuales debera reportarse con el Supervisor o Gerente correspondiente durante la primera hora de trabajo de su horario correspondiente. \n");

                                            System.out.print("7.    No esta permitido laborar tiempo extra sin contar con solicitud por escrito por parte de la empresa. \n");

                                            System.out.print("8.    Las guardias solo se cubriran cuando algun Colaborador se ausente de sus labores. \n");

                                            System.out.print("9.    Es obligacion de la Empresa cumplir con las fechas y forma de pago que esta determine, al igual que informar a sus Colaboradores sobre algun cambio referente a fechas o forma de pago. \n");

                                            System.out.print("10.   El pago se realizara en base al control de incidencias que presente el Colaborador en los controles y registro de asistencia que para tal efecto señale la Empresa. \n");

                                            System.out.print("11.   La Empresa esta facultada para solicitarle a los Colaboradores apoyo para cubrir horas fuera de su horario establecido, cuando la operacion asi­ lo requiera, las cuales seran tomadas en cuenta para efectos del pago correspondiente. \n");

                                            System.out.print("12.   El Colaborador tendra la obligacion de abstenerse en todo momento de comer en su area de trabajo cualquier tipo de alimento. Tambien debera abstener de fumar, mascar chicles o tomar bebidas alcoholicas, o cualquier tipo de bebidas en recipientes sin tapa que ponga en riesgo cualquier herramienta/equipo/material de trabajo/documento. \n");

                                            System.out.print("13.   El Colaborador tendra la obligacion de abstenerse en adoptar posturas, actitudes, palabras o señas contrarias a las buenas costumbres, durante todo el tiempo que permanezca en las instalaciones del CC y de la Empresa. \n");

                                            System.out.print("14.   El Colaborador tendra la obligacion de permanecer en su estacion de trabajo durante todo su horario de labores, salvo previa autorizacion del Supervisor o Gerente, o bien, durante los periodos de descanso previamente asignados y autorizados por el Supervisor o Gerente, quien tendra la obligacion de administrar dichos descansos en base a las necesidades y servicio de la operacion del Contact Center. \n");

                                            System.out.print("15.   El Colaborador tendra la obligacion de abstenerse de distraer a sus compañeros de trabajo a traves de saludos, abrazos, etc. durante todo el tiempo que se encuentre dentro del Contact Center.");

                                            System.out.print("16.   El Colaborador tendra la obligacion de abstenerse de introducir y/o hacer uso de radios, grabadoras, discman, telefonos celulares, o cualquier otro tipo de aparato ajeno a los requeridos por la operacion del area. \n");

                                            System.out.print("17.   El Colaborador tiene prohibido extraer informacion, herramientas, material, mercanci­a, equipo, accesorios, etc. propiedad de la empresa sin permiso de esta. \n");

                                            System.out.print("18.   El Colaborador tendra la obligacion de abstenerse en todo momento de alterar los sistemas, procedimientos e informacion proporcionados por la Empresa para el buen desarrollo del trabajo, al igual que cargar en sus equipos de computo otros sistemas ajenos a los autorizados e instalados por la empresa. \n");

                                            System.out.print("19.   El Colaborador tendra la obligacion de abstenerse de hacer uso de las herramientas/equipos/material de trabajo para fines de beneficio personal, ajenos a la operacion y servicio prestados por la Empresa. \n");

                                            System.out.print("20.   El Colaborador tendra la obligacion de abstenerse de invertir tiempo de su horario de trabajo en actividades diferentes a las requeridas por el area o por la Empresa. \n");

                                            System.out.print("21.   El Colaborador tendra la obligacion de desempeñar las funciones que le sean asignadas con todo el empeño, diligencia, honradez y moralidad para llevar a buen fin su trabajo. \n");

                                            System.out.print("22.   Es obligacion del Colaborador cuidar y mantener en buen estado todo el equipo/ herramienta/material que la Empresa le proporcione para el desarrollo de sus actividades. \n");

                                            System.out.print("23.   Si por negligencia, descuido o mala fe, se extraen, se destruyan o se avenen equipo/ herramienta/ material propiedad de la Empresa que esten asignados bajo la responsabilidad del Colaborador, este debera pagar el importe correspondiente por la reposicion o compostura de las mismas, independientemente de la sancion a la Empresa determine. \n");

                                            System.out.print("24.   El Colaborador debera tratar a sus supervisores y companeros con la atencion y cortesia debida, evitando toda palabra o acto que pueda relajar los principios de autoridad, de disciplina o de respeto a cualquier persona. \n");

                                            System.out.print("25.   El Colaborador debera guardar escrupulosamente la confidencialidad de los datos y documentos de la Empresa, asi como de los asuntos cuya divulgacion pueda causar perjuicios a la Empresa. \n");

                                            System.out.print("26.   Es obligacion del Colaborador presentarse a sus labores cuidando su imagen personal en cuanto a limpieza, pulcritud y vestimenta apropiada y autorizada por la Empresa. \n");

                                            System.out.print("27.   Es obligacion del Colaborador apegarse a las politicas de vestimenta determinadas por la Empresa, durante todo el tiempo que se presente a sus labores.");

                                            System.out.print("28.   Es obligacion del Colaborador mantener en orden y limpieza las estaciones de trabajo al igual que todas las instalaciones del Contact Center y de la Empresa. \n");

                                            System.out.print("29.   Es obligacion del Colaborador abstenerse en permitir el acceso al Contact Center de personas ajenas al mismo sin la previa autorizacion del responsable del area. \n");

                                            System.out.print("30.   Es obligacion del Colaborador la aplicacion de todos los examenes y/o valoraciones medicas que la Empresa determine para tal efecto, apegandose a la forma, lugar y hora en que estos sean determinados por la misma. \n");

                                            System.out.print("31.   Es obligacion del Colaborador evitar relaciones de tipo amorosas, noviazgo y/o matrimonio con personas que laboren en el Contact Center, en cuyo caso se considerara conflicto de intereses, y por lo cual, alguna de las dos personas deberan presentar su renuncia voluntaria inmediatamente. \n");
                                        }

                                        case 3 -> {
                                            System.out.println("Esta es la opcion 3");
                                            System.out.print("NORMAS RELATIVAS: ");

                                            System.out.print("1.	En el puesto de trabajo es permitido tener una botella con li­quido, pero no es permitido el consumo de alimentos o masticar chicle en el area de Call. \n");

                                            System.out.print("2.	Las bolsas y las maletas deben ser guardadas en el locker antes de ingresar al area de Call Center. \n");

                                            System.out.print("3.	Esta prohibido tener en el puesto de trabajo maquillaje, espejos, lomas, depiladores u objetos de uso personal. \n");

                                            System.out.print("4.	No es permitido decorar el puesto con afiches, fotos grandes, portarretratos ni porcelanas. \n");

                                            System.out.print("5.	El locker debe mantenerse con candado el cuidado es responsabilidad de quien lo use. \n");

                                            System.out.print("6.	Si el operador incurre a la falta de no registrar una llamada o de registrarla erroneamente, si es necesario y direccion los pide, este sera sancionado con el precio monetario que esta falta tenga. \n");
                                        }

                                        case 4 -> {
                                            System.out.println("Esta es la opcion 4 \n");
                                            System.out.print("NORMAS RELATIVAS A CONDUCTA Y COMPORTAMIENTO: \n");

                                            System.out.print("1.	Las llamadas personales no estan permitidas desde las lineas de Call Center y cuando se hagan deben contar con la autorizacion del Coordinador y utilizando las lineas destinadas para tal fin. \n");

                                            System.out.print("2.	No estan permitidas las demostraciones afectivas, se deben mantener fuera del lugar de trabajo y en ningun caso podran interferir con las funciones a desempeñar. \n");

                                            System.out.print("3.	No esa permitido traer niños en horas laborales, ni el ingreso de los mismos a la zona de Call Center. \n");

                                            System.out.print("4.	No esta permitido escuchar musica mediante audifonos en el puesto de trabajo y en especial cuando se esta en una llamada telefonica. \n");

                                            System.out.print("5.	Se debe hacer uso adecuado de las saladas de espera, las cuales estan destinadas a la atencion de titulares. \n");

                                            System.out.print("6.	Los baños y las zonas de cafeteria se deben conservar en perfecto estado despues de su uso, (puertas cerradas, luz apagada, llaves bien cerradas). \n");

                                            System.out.print("7.   	Mantener buena disciplina en general. \n");
                                        }

                                        case 5 -> {
                                            System.out.println("Esta es la opcion 5 \n");
                                            System.out.print("NORMAS RELATIVAS A LA PRESENTACION PERSONAL: \n" );

                                            System.out.print("1.	Presentacion personal impecable. \n");

                                            System.out.print("2.	Prohibido el uso de zapatos color blanco, leggins de colores llamativos o con estampados, botas con peluche. \n");

                                            System.out.print("3.	Los dias Sabado esta prohibido el uso de prendas como: gorras, camisetas deportivas, tenis blancos, pantalones camuflajeados y rotos. \n");

                                            System.out.print("4.	No se permiten aretes en hombres y piercing tanto en hombre como en mujeres. \n");

                                            System.out.print("5.	No se permite cabello lago ni colas en hombres. \n");

                                            System.out.print("6.	Se debe portar la credencial de la empresa durante la estancia en las instalaciones. \n");
                                        }

                                        case 6 -> {
                                            System.out.println("Esta es la opcion 6 \n");
                                            System.out.print("NORMAS DE SEGURIDAD: \n");

                                            System.out.print("1.	Esta prohibido prestar usuarios y claves, suplantar, loguear a otro operador y loguearse y posteriormente ausentarse fi­sicamente del puesto de trabajo por cualquier circunstancia debe bloquear el equipo. \n");

                                            System.out.print("2.	El escritorio debe permanecer libre de cualquier documento o articulo que no tenga que ver con el area. \n");

                                            System.out.print("3.	El uso de camaras fotograficas o de video, memoria USB u otro medio magnetico no esta permitido, deben ser guardados en el locker. \n");

                                            System.out.print("4.	Los telefonos celulares de uso personal deben permanecer guardados en los locker. \n");
                                        }

                                        case 7 ->{
                                            System.out.println("Espacio de quejas \n");
                                            System.out.print("Ingrese su molestia a la falta normativa \n");

                                            Quejas laQueja = new Quejas();
                                            laQueja.setQueja(JOptionPane.showInputDialog("Ingrese su molestia"));
                                            laQueja.setPeticion(JOptionPane.showInputDialog("Ingrese su comentario a mejorar"));


                                            System.out.println(laQueja.getQueja());
                                            System.out.println(laQueja.getPeticion());

                                        }
                                        case 8 -> salir3 = true;
                                        default -> System.out.println("Las opciones son entre 1 y 7, 8 salir ");
                                    }

                                    System.out.println("Fin del menu");
                                } catch(InputMismatchException e){
                                    System.out.println("Debes escribir un numero");
                                    sn.next();

                                }


                            }

                            break;
                        case 7:
                            salir = true;
                            System.out.println("Fin del menu");
                            break;
                        default:
                            System.out.println("Las opciones son entre 1 y 9");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Debes escribir un numero");
                    sn.next();
                }
            }
            }
        else{
            System.out.println("Pin incorrecto");
        }
        }

    }


