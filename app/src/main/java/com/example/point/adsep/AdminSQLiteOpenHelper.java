package com.example.point.adsep;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RobertoZan on 04/07/2016.
 */
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table preguntas(idPregunta integer primary key, descripcion text,respuestaElegida text, respuestaCor text )");
        db.execSQL("create table respuestas(idRespuesta integer, descripcion text, idPregunta integer, primary key(idRespuesta,idPregunta))");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(1,'Pregunta 1.- Identifique las acciones docentes que promueven derechos infantiles, conforme a la Declaración de los derechos del niño de la Organización de las Naciones Unidas.\n\n" +
                "1.- Interviene en los procesos para que un alumno de corta edad que sufre maltrato físico o psicológico familiar, sea separado de su madre   para canalizarse a una institución segura.\n\n" +
                "2.-Interviene en los procesos para que el alumno que sufre maltrato físico o psicológico familiar, no sea separado de su madre debido a su corta edad.\n\n" +
                "3.- Ayuda a clarificar o corregir inconsistencias, errores u omisiones en los registros escolares del nombre de los alumnos.\n\n" +
                "4.- Evita manifestar expresiones afectivas hacia el alumno, para evitar que se interpreten como deseables, por lo que se restringe al trato cordial y respetuoso.\n','1,3')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(2,'Pregunta 2.-  Identifique las situaciones escolares que garanticen el derecho  la educación. \n\n" +
                "1.- La directora de una escuela solicita al padre del alumno que presente los documentos legales para proceder a la inscripción, mientras tanto no podrá asistir a la escuela.\n\n" +
                "2.- La docente, en conjunción con USAER  brinda estrategias de integración a un alumno de nuevo ingreso que fue excluido por su comportamiento de los centros cercanos a  la institución.\n\n" +
                "3.- Un alumno de sexto grado de educación primaria con NEE NO  asistirá a la secundaria porque sus padres consideran que se le discriminará por lo que prefieren dejarlo en casa.\n\n" +
                "4.- Una alumna tuvo un accidente y no podrá asistir  clases por dos meses, la maestra proporciona facilidades para su reincorporación y le envía tareas para su casa.\n','2,3')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(3,'Pregunta 3.-  Un alumno deserta de la escuela por causa de un trastorno de la alimentación. El docente propone a su grupo informarse acerca de este trastorno y diseñar una estrategia para coadyuvar a la solución del problema de su compañero. Identifique la estrategia de búsqueda de información que atienda la intención planeada.','1')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(4,'Pregunta 4.- En el aula de sexto grado los alumnos expresan dudas sobre el porqué surgen las enfermedades de transmisión sexual.\n" +
                "Identifique las estrategias didácticas que considere lo que saben los alumnos para favorecer su aprendizaje.\n','2')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(5,'Pregunta 5.-  Los alumnos de cuarto grado están muy inquietos pues quieren observar una fuerte granizada que cayó en el patio de la escuela. El docente decide aprovechar el interés de los niños para abordar el tema de los estados del agua. Señale las estrategias didácticas que permite a los alumnos preguntar, imaginar y explicar los contenidos estudiados.\n\n" +
                "1.- El docente pide a los alumnos que escriban un texto del libro de ciencias naturales de cuarto grado, acerca de cada uno de los estados del agua, para que de esta forma los alumnos amplíen sus conocimientos sobre este fenómeno natural.\n\n" +
                "2.- Por medio de una mesa de debate se pide a los alumnos que mencionen ¿Por qué creen que el agua se congela? El maestro escribe las palabras clave en el pizarrón y finalmente da una explicación detallada para aclarar dudas.\n\n" +
                "3.- El docente pide a los alumnos hacer un dibujo de granizo y comentar alguna experiencia personal, exponiendo al grupo sus vivencias.\n\n" +
                "4.- El docente permite de manera organizada observen el granizo, para que satisfagan su curiosidad. Posteriormente redactan un texto sobre las sensaciones que esto les causó y finalmente algunos exponen sus trabajos.\n\n" +
                "5.- El docente dicta un texto para llamar la atención de los alumnos, luego pide que algunos de ellos lean este texto en voz alta, finalmente escribe algunas preguntas en el pizarrón y las responden.\n','4')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(6,'Pregunta 6.- La docente de quinto grado atiende el aprendizaje esperado: Resuelve problemas que impactan el uso de las características y propiedades de triángulos y cuadriláteros, sin embargo, se da cuenta que varios de ellos tiene dificultades para resolver estos problemas.\n" +
                "¿Cuál estrategia didáctica atiende el enfoque para la enseñanza de las matemáticas en primaria?\n','1')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(7,'Pregunta 7.-  En un grupo de cuarto grado el docente considera distintas estrategias para lograr el aprendizaje esperado: Recuperando información mediante entrevistas.\n" +
                "Seleccione la estrategia didáctica que fomente el aprendizaje mediante la interacción de los alumnos.\n','3')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(8,'Pregunta 8.- Una docente que inicia el ciclo escolar con un grupo de quinto grado percibe que no hay una buena relación  entre los alumnos, por lo que el desarrollo de actividades se complica constantemente.\n\n" +
                "Seleccione las estrategias que debe emplear para generar un clima de confianza basado en la inclusión.\n\n" +
                "1.- Implementar diversas dinámicas de integración grupal.\n\n" +
                "2.- Propiciar la expresión de puntos de vista personales ante conflictos.\n\n" +
                "3.- Implementar actividades donde los padres participen en las clases.\n\n" +
                "4.- Organizar trabajos en equipo donde los alumnos aporten materiales, los intercambien y elaboren productos.\n','1')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(9,'Pregunta 9.-  En reunión de Consejo Técnico  en una escuela primaria, los maestros analizan el problema de un grupo que incurre en actitudes notorias de discriminación hacia algunos compañeros. \n" +
                "Señale cuál de las siguientes acciones docentes propicia un clima de confianza en el grupo, basado en el dialogo.\n','3')");
        db.execSQL("insert into preguntas(idPregunta, descripcion,respuestaCor) values(10,'Pregunta 10.-  Durante la presentación de diversos tipos de danza en la escuela, el grupo de danza clásica no hizo lo propio,  ya que dos niños dijeron que “no eran niñas para bailar esa música”.\n\n" +
                "Seleccione las acciones que el docente puede implementar para involucrar a los alumnos en la construcción de reglas que fomenten la perspectiva de género.\n\n" +
                "1.- Hacer la lectura en voz alta de un texto  donde se define el término equidad.\n\n" +
                "2.- Debatir grupalmente sobre las experiencias personales en torno a las actividades e hombres y mujeres en la casa, la escuela o la comunidad.\n\n" +
                "3.- Conversa acerca de las actividades que más gustan a cada alumno y las consecuencias de estas actividades.\n\n" +
                "4.- Organizar competencias entre hombres y mujeres para llevar a la práctica la igualdad de géneros.\n','3')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(11,'Pregunta 11.-  Un docente recién asignado a una escuela regular en una comunidad rural se encuentra con que no habla la misma lengua que la mayoría de sus alumnos, aun cuando pueden entender el idioma español. Los pocos alumnos que hablan su lengua, se resisten a hacerlo por falta de costumbre y temor a cometer errores. A partir de esta situación, identifique las estrategias didácticas que atienden la diversidad lingüística del grupo.\n\n" +
                "1.- Organizar que un alumno tome el papel del docente y enseñe a sus compañeros formas básicas para comunicarse en su lengua: saludos, frases y palabras de uso común en la vida cotidiana y en la escuela.\n\n" +
                "2.- Elaborar un reglamento de convivencia y trabajo donde se promueva en forma gradual la incorporación del idioma español en las clases como forma única de comunicación, la lengua local podrá hablarse en los tiempos de descanso.\n\n" +
                "3.- Impartir talleres a alumnos y padres de familia con actividades recreativas de dialogo y narración en torno a costumbres de la región en la lengua local y en español.\n\n" +
                "4.- Crear una biblioteca multilingüe del aula, solicitando material al Consejo Nacional para la Cultura y las Artes y al Consejo Nacional de Fomento Educativo.\n','2')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(12,'Pregunta 12.-  Al inicio del ciclo escolar se integró a un grupo de tercer grado un alumno con déficit de atención. Con frecuencia no realiza las actividades que se le sugieren, se retira del salón sin permiso, no obedece  los maestros y es agresivo con sus compañeros.\n\n" +
                "Identifique las estrategias didácticas que el docente puede desarrollar para que el alumno se involucre en las actividades del grupo  y desarrolle el sentido de pertenencia.\n\n" +
                "1.- Solicitar a la mamá del alumno que asista con él a clases, por lo menos 2 horas al dia para acompañarlo en sus actividades.\n\n" +
                "2.- Gestionar ante el director o el especialista de la escuela las posibilidades de respuesta o profundidad de los servicios que se le pueden ofrecer al alumno.\n\n" +
                "3.- Organizar actividades de sensibilización que involucren a la familia para dar cumplimiento al logro educativo de todos los alumnos de la escuela.\n\n" +
                "4.- Incluir en su planeación actividades extraescolares para este alumno, que deberán ser supervisadas por su mamá.\n','1')");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(13,'Pregunta 13.-  Un alumno con escasos recursos económicos se traslada a pie a la escuela desde una comunidad distante, sin servicios educativos de ninguna clase. El alumno se encuentra en riesgo de reprobación o deserción debido a las dificultades del traslado diario, que afecta su tiempo disponible para estudiar y hacer tareas escolares.\n\n" +
                "Identifique las estrategias docentes que contribuyan a eliminar sus barreras de aprendizaje.\n\n" +
                "1.- Diseñar una planificación diferenciadas con guiones de tareas para que el alumno estudie en su casa y no requiera asistir todos los días a la escuela.\n\n" +
                "2.- Diseñar una planificación diferenciada con estrategias de aprendizaje concretas que le permitan al alumno optimizar su tiempo para el aprendizaje.\n\n" +
                "3. Organizar un proyecto grupal de actividades para reunir recursos y así comprar un medio de transporte para el alumno.\n\n" +
                "4.- Gestionar ante las autoridades locales un apoyo de transporte para facilitar su traslado.\n','4')");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(1,'1,3',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(2,'1,4',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(3,'2,3',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(4,'2,4',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(5,'1,2',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(6,'2,3',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(7,'2,4',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(8,'3,4',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(9,'Búsqueda de información  por equipos en fuentes localizadas en sitios de Internet y en libros de la biblioteca local',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(10,'Entrevistas a médicos de la comunidad acerca de causas  tratamiento de trastorno.',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(11,'Encuesta a alumnos y profesores de la escuela sobre estrategias de atención del problema',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(12,'Revisión de datos del alumno en el archivo escolar y de información en sitios de Internet.',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(13,'Mediante lluvias de ideas se anota en el pizarrón los nombres de enfermedades que los alumnos conocen, luego se indaga en la biblioteca escolar, se realiza una exposición por equipos sobre el tema y finalmente se lleva a cabo una coevaluación.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(14,'El docente realiza una exposición con diapositivas  y habla acerca de todas las enfermedades de transmisión sexual, apoyándose en un especialista, el cual, al final de la presentación, resuelve las dudas de los alumnos.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(15,'Mediante preguntas escritas planteadas al final de la clase, después de haber visto el tema de enfermedades de transmisión sexual, el docente verifica el aprendizaje logrado por sus alumnos y les encarga una tarea complementaria.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(16,'Entrega por equipos información relevante donde se describen los casos de infecciones de transmisión sexual  y se responde un cuestionario elaborado previamente por el docente, al final se pide un resumen sobre todo lo visto acerca de enfermedades de transmisión sexual.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(17,'1,2,3',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(18,'1,3,5',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(19,'2,3,4',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(20,'2,4,5',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(21,'Plantean un problema de medición de la superficie del salón para que los alumnos, organizados en equipos lo resuelvan con los recursos propios.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(22,'Plantea problemas obtenidos de internet que favorecen el ejercicio repetido de cálculos matemáticos, lo que se hace de manera individual para asegurar que lleven a cabo las actividades.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(23,'Explica claramente la fórmula para el cálculo de las superficies de triángulos y posteriormente propicia que la apliquen en diversos problemas para lograr su dominio.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(24,'Plantea problemas para que sean resueltos en equipos, promoviendo que los alumnos no se equivoquen y logran los resultados exactos que se solicitan.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(25,'Los alumnos sentados en mesas para cinco personas redactan en su cuaderno algunas preguntas que consideran convenientes.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(26,'Los alumnos sentados en mesas para cinco personas redactan en su cuaderno algunas preguntas que consideran convenientes.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(27,'Los alumnos intercambian sus cuadernos en parejas para comparar sus preguntas.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(28,'El docente pide a algunos alumnos que expliquen al grupo que aspectos consideran importantes para seleccionar las preguntas que utilizarán su entrevista.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(29,'1,2',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(30,'1,4',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(31,'2,3',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(32,'3,4',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(33,'Habilitar un buzón para transmitir al grupo o compañeros, ideas, sentimientos y propuestas en forma confidencial.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(34,'Ofrecer una dirección de correo electrónico para recibir comentarios de los alumnos en los tiempos extra clase.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(35,'Establecer un reglamento para la discusión y expresión de las necesidades propias.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(36,'Definir un calendario de sesiones para la manifestación de propuestas de interés para los alumnos.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(37,'1,4',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(38,'1,3',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(39,'2,4',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(40,'3,4',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(41,'1,2',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(42,'1,3',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(43,'2,4',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(44,'3,4',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(45,'1,2',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(46,'1,4',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(47,'2,3',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(48,'3,4',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(49,'1,2',13)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(50,'1,3',13)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(51,'2,4',13)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(52,'3,4',13)");




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exist preguntas");
        db.execSQL("drop table if exist respuestas");
        db.execSQL("create table preguntas(idPregunta integer primary key, descripcion text,respuestaElegida text, respuestaCor integer )");
        db.execSQL("create table respuestas(idRespuesta integer, descripcion text, idPregunta integer, primary key(idRespuesta,idPregunta))");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(1,'Pregunta 1.- Identifique las acciones docentes que promueven derechos infantiles, conforme a la Declaración de los derechos del niño de la Organización de las Naciones Unidas.\n\n" +
                "1.- Interviene en los procesos para que un alumno de corta edad que sufre maltrato físico o psicológico familiar, sea separado de su madre   para canalizarse a una institución segura.\n\n" +
                "2.-Interviene en los procesos para que el alumno que sufre maltrato físico o psicológico familiar, no sea separado de su madre debido a su corta edad.\n\n" +
                "3.- Ayuda a clarificar o corregir inconsistencias, errores u omisiones en los registros escolares del nombre de los alumnos.\n\n" +
                "4.- Evita manifestar expresiones afectivas hacia el alumno, para evitar que se interpreten como deseables, por lo que se restringe al trato cordial y respetuoso.\n',4)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(2,'Pregunta 2.-  Identifique las situaciones escolares que garanticen el derecho  la educación. \n\n" +
                "1.- La directora de una escuela solicita al padre del alumno que presente los documentos legales para proceder a la inscripción, mientras tanto no podrá asistir a la escuela.\n\n" +
                "2.- La docente, en conjunción con USAER  brinda estrategias de integración a un alumno de nuevo ingreso que fue excluido por su comportamiento de los centros cercanos a  la institución.\n\n" +
                "3.- Un alumno de sexto grado de educación primaria con NEE NO  asistirá a la secundaria porque sus padres consideran que se le discriminará por lo que prefieren dejarlo en casa.\n\n" +
                "4.- Una alumna tuvo un accidente y no podrá asistir  clases por dos meses, la maestra proporciona facilidades para su reincorporación y le envía tareas para su casa.\n',4)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(3,'Pregunta 3.-  Un alumno deserta de la escuela por causa de un trastorno de la alimentación. El docente propone a su grupo informarse acerca de este trastorno y diseñar una estrategia para coadyuvar a la solución del problema de su compañero. Identifique la estrategia de búsqueda de información que atienda la intención planeada.',1)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(4,'Pregunta 4.- En el aula de sexto grado los alumnos expresan dudas sobre el porqué surgen las enfermedades de transmisión sexual.\n" +
                "Identifique las estrategias didácticas que considere lo que saben los alumnos para favorecer su aprendizaje.\n',2)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(5,'Pregunta 5.-  Los alumnos de cuarto grado están muy inquietos pues quieren observar una fuerte granizada que cayó en el patio de la escuela. El docente decide aprovechar el interés de los niños para abordar el tema de los estados del agua. Señale las estrategias didácticas que permite a los alumnos preguntar, imaginar y explicar los contenidos estudiados.\n\n" +
                "1.- El docente pide a los alumnos que escriban un texto del libro de ciencias naturales de cuarto grado, acerca de cada uno de los estados del agua, para que de esta forma los alumnos amplíen sus conocimientos sobre este fenómeno natural.\n\n" +
                "2.- Por medio de una mesa de debate se pide a los alumnos que mencionen ¿Por qué creen que el agua se congela? El maestro escribe las palabras clave en el pizarrón y finalmente da una explicación detallada para aclarar dudas.\n\n" +
                "3.- El docente pide a los alumnos hacer un dibujo de granizo y comentar alguna experiencia personal, exponiendo al grupo sus vivencias.\n\n" +
                "4.- El docente permite de manera organizada observen el granizo, para que satisfagan su curiosidad. Posteriormente redactan un texto sobre las sensaciones que esto les causó y finalmente algunos exponen sus trabajos.\n\n" +
                "5.- El docente dicta un texto para llamar la atención de los alumnos, luego pide que algunos de ellos lean este texto en voz alta, finalmente escribe algunas preguntas en el pizarrón y las responden.\n',4)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(6,'Pregunta 6.- La docente de quinto grado atiende el aprendizaje esperado: Resuelve problemas que impactan el uso de las características y propiedades de triángulos y cuadriláteros, sin embargo, se da cuenta que varios de ellos tiene dificultades para resolver estos problemas.\n" +
                "¿Cuál estrategia didáctica atiende el enfoque para la enseñanza de las matemáticas en primaria?\n',1)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(7,'Pregunta 7.-  En un grupo de cuarto grado el docente considera distintas estrategias para lograr el aprendizaje esperado: Recuperando información mediante entrevistas.\n" +
                "Seleccione la estrategia didáctica que fomente el aprendizaje mediante la interacción de los alumnos.\n',3)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(8,'Pregunta 8.- Una docente que inicia el ciclo escolar con un grupo de quinto grado percibe que no hay una buena relación  entre los alumnos, por lo que el desarrollo de actividades se complica constantemente.\n\n" +
                "Seleccione las estrategias que debe emplear para generar un clima de confianza basado en la inclusión.\n\n" +
                "1.- Implementar diversas dinámicas de integración grupal.\n\n" +
                "2.- Propiciar la expresión de puntos de vista personales ante conflictos.\n\n" +
                "3.- Implementar actividades donde los padres participen en las clases.\n\n" +
                "4.- Organizar trabajos en equipo donde los alumnos aporten materiales, los intercambien y elaboren productos.\n',1)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(9,'Pregunta 9.-  En reunión de Consejo Técnico  en una escuela primaria, los maestros analizan el problema de un grupo que incurre en actitudes notorias de discriminación hacia algunos compañeros. \n" +
                "Señale cuál de las siguientes acciones docentes propicia un clima de confianza en el grupo, basado en el dialogo.\n',3)");
        db.execSQL("insert into preguntas(idPregunta, descripcion,respuestaCor) values(10,'Pregunta 10.-  Durante la presentación de diversos tipos de danza en la escuela, el grupo de danza clásica no hizo lo propio,  ya que dos niños dijeron que “no eran niñas para bailar esa música”.\n\n" +
                "Seleccione las acciones que el docente puede implementar para involucrar a los alumnos en la construcción de reglas que fomenten la perspectiva de género.\n\n" +
                "1.- Hacer la lectura en voz alta de un texto  donde se define el término equidad.\n\n" +
                "2.- Debatir grupalmente sobre las experiencias personales en torno a las actividades e hombres y mujeres en la casa, la escuela o la comunidad.\n\n" +
                "3.- Conversa acerca de las actividades que más gustan a cada alumno y las consecuencias de estas actividades.\n\n" +
                "4.- Organizar competencias entre hombres y mujeres para llevar a la práctica la igualdad de géneros.\n',3)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(11,'Pregunta 11.-  Un docente recién asignado a una escuela regular en una comunidad rural se encuentra con que no habla la misma lengua que la mayoría de sus alumnos, aun cuando pueden entender el idioma español. Los pocos alumnos que hablan su lengua, se resisten a hacerlo por falta de costumbre y temor a cometer errores. A partir de esta situación, identifique las estrategias didácticas que atienden la diversidad lingüística del grupo.\n\n" +
                "1.- Organizar que un alumno tome el papel del docente y enseñe a sus compañeros formas básicas para comunicarse en su lengua: saludos, frases y palabras de uso común en la vida cotidiana y en la escuela.\n\n" +
                "2.- Elaborar un reglamento de convivencia y trabajo donde se promueva en forma gradual la incorporación del idioma español en las clases como forma única de comunicación, la lengua local podrá hablarse en los tiempos de descanso.\n\n" +
                "3.- Impartir talleres a alumnos y padres de familia con actividades recreativas de dialogo y narración en torno a costumbres de la región en la lengua local y en español.\n\n" +
                "4.- Crear una biblioteca multilingüe del aula, solicitando material al Consejo Nacional para la Cultura y las Artes y al Consejo Nacional de Fomento Educativo.\n',2)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(12,'Pregunta 12.-  Al inicio del ciclo escolar se integró a un grupo de tercer grado un alumno con déficit de atención. Con frecuencia no realiza las actividades que se le sugieren, se retira del salón sin permiso, no obedece  los maestros y es agresivo con sus compañeros.\n\n" +
                "Identifique las estrategias didácticas que el docente puede desarrollar para que el alumno se involucre en las actividades del grupo  y desarrolle el sentido de pertenencia.\n\n" +
                "1.- Solicitar a la mamá del alumno que asista con él a clases, por lo menos 2 horas al dia para acompañarlo en sus actividades.\n\n" +
                "2.- Gestionar ante el director o el especialista de la escuela las posibilidades de respuesta o profundidad de los servicios que se le pueden ofrecer al alumno.\n\n" +
                "3.- Organizar actividades de sensibilización que involucren a la familia para dar cumplimiento al logro educativo de todos los alumnos de la escuela.\n\n" +
                "4.- Incluir en su planeación actividades extraescolares para este alumno, que deberán ser supervisadas por su mamá.\n',1)");
        db.execSQL("insert into preguntas(idPregunta,descripcion,respuestaCor) values(13,'Pregunta 13.-  Un alumno con escasos recursos económicos se traslada a pie a la escuela desde una comunidad distante, sin servicios educativos de ninguna clase. El alumno se encuentra en riesgo de reprobación o deserción debido a las dificultades del traslado diario, que afecta su tiempo disponible para estudiar y hacer tareas escolares.\n\n" +
                "Identifique las estrategias docentes que contribuyan a eliminar sus barreras de aprendizaje.\n\n" +
                "1.- Diseñar una planificación diferenciadas con guiones de tareas para que el alumno estudie en su casa y no requiera asistir todos los días a la escuela.\n\n" +
                "2.- Diseñar una planificación diferenciada con estrategias de aprendizaje concretas que le permitan al alumno optimizar su tiempo para el aprendizaje.\n\n" +
                "3. Organizar un proyecto grupal de actividades para reunir recursos y así comprar un medio de transporte para el alumno.\n\n" +
                "4.- Gestionar ante las autoridades locales un apoyo de transporte para facilitar su traslado.\n',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(1,'1,3',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(2,'1,4',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(3,'2,3',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(4,'2,4',1)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(5,'1,2',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(6,'2,3',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(7,'2,4',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(8,'3,4',2)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(9,'Búsqueda de información  por equipos en fuentes localizadas en sitios de Internet y en libros de la biblioteca local',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(10,'Entrevistas a médicos de la comunidad acerca de causas  tratamiento de trastorno.',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(11,'Encuesta a alumnos y profesores de la escuela sobre estrategias de atención del problema',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(12,'Revisión de datos del alumno en el archivo escolar y de información en sitios de Internet.',3)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(13,'Mediante lluvias de ideas se anota en el pizarrón los nombres de enfermedades que los alumnos conocen, luego se indaga en la biblioteca escolar, se realiza una exposición por equipos sobre el tema y finalmente se lleva a cabo una coevaluación.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(14,'El docente realiza una exposición con diapositivas  y habla acerca de todas las enfermedades de transmisión sexual, apoyándose en un especialista, el cual, al final de la presentación, resuelve las dudas de los alumnos.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(15,'Mediante preguntas escritas planteadas al final de la clase, después de haber visto el tema de enfermedades de transmisión sexual, el docente verifica el aprendizaje logrado por sus alumnos y les encarga una tarea complementaria.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(16,'Entrega por equipos información relevante donde se describen los casos de infecciones de transmisión sexual  y se responde un cuestionario elaborado previamente por el docente, al final se pide un resumen sobre todo lo visto acerca de enfermedades de transmisión sexual.',4)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(17,'1,2,3',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(18,'1,3,5',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(19,'2,3,4',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(20,'2,4,5',5)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(21,'Plantean un problema de medición de la superficie del salón para que los alumnos, organizados en equipos lo resuelvan con los recursos propios.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(22,'Plantea problemas obtenidos de internet que favorecen el ejercicio repetido de cálculos matemáticos, lo que se hace de manera individual para asegurar que lleven a cabo las actividades.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(23,'Explica claramente la fórmula para el cálculo de las superficies de triángulos y posteriormente propicia que la apliquen en diversos problemas para lograr su dominio.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(24,'Plantea problemas para que sean resueltos en equipos, promoviendo que los alumnos no se equivoquen y logran los resultados exactos que se solicitan.',6)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(25,'Los alumnos sentados en mesas para cinco personas redactan en su cuaderno algunas preguntas que consideran convenientes.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(26,'Los alumnos sentados en mesas para cinco personas redactan en su cuaderno algunas preguntas que consideran convenientes.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(27,'Los alumnos intercambian sus cuadernos en parejas para comparar sus preguntas.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(28,'El docente pide a algunos alumnos que expliquen al grupo que aspectos consideran importantes para seleccionar las preguntas que utilizarán su entrevista.',7)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(29,'1,2',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(30,'1,4',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(31,'2,3',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(32,'3,4',8)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(33,'Habilitar un buzón para transmitir al grupo o compañeros, ideas, sentimientos y propuestas en forma confidencial.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(34,'Ofrecer una dirección de correo electrónico para recibir comentarios de los alumnos en los tiempos extra clase.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(35,'Establecer un reglamento para la discusión y expresión de las necesidades propias.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(36,'Definir un calendario de sesiones para la manifestación de propuestas de interés para los alumnos.',9)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(37,'1,4',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(38,'1,3',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(39,'2,4',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(40,'3,4',10)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(41,'1,2',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(42,'1,3',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(43,'2,4',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(44,'3,4',11)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(45,'1,2',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(46,'1,4',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(47,'2,3',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(48,'3,4',12)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(49,'1,2',13)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(50,'1,3',13)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(51,'2,4',13)");
        db.execSQL("insert into respuestas(idRespuesta,descripcion,idPregunta) values(52,'3,4',13)");


    }
}
