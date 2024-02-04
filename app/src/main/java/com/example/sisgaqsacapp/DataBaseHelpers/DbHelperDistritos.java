package com.example.sisgaqsacapp.DataBaseHelpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelperDistritos extends SQLiteOpenHelper {
    private static final String BASE_NOMBRE = "db_telco_distritos.db";
    private static final int BASE_VERSION = 3;
    protected static final String TABLE_DISTRITOS = "t_distritos";
    public DbHelperDistritos(@Nullable Context context) {
        super(context,BASE_NOMBRE,null,BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLE_DISTRITOS+"("+
                "id INTEGER PRIMARY KEY NOT NULL," +
                "nombreDistrito TEXT NOT NULL," +
                "idProvincia INTEGER NOT NULL)");

        sqLiteDatabase.execSQL("INSERT INTO "+ TABLE_DISTRITOS+ "(id, nombreDistrito,idProvincia) VALUES"+
                "(10101,'Chachapoyas',101),"+
                "(10102,'AsunciÃ³n',101),"+
                "(10103,'Balsas',101),"+
                "(10104,'Cheto',101),"+
                "(10105,'Chiliquin',101),"+
                "(10106,'Chuquibamba',101),"+
                "(10107,'Granada',101),"+
                "(10108,'Huancas',101),"+
                "(10109,'La Jalca',101),"+
                "(10110,'Leimebamba',101),"+
                "(10111,'Levanto',101),"+
                "(10112,'Magdalena',101),"+
                "(10113,'Mariscal Castilla',101),"+
                "(10114,'Molinopampa',101),"+
                "(10115,'Montevideo',101),"+
                "(10116,'Olleros',101),"+
                "(10117,'Quinjalca',101),"+
                "(10118,'San Francisco de Daguas',101),"+
                "(10119,'San Isidro de Maino',101),"+
                "(10120,'Soloco',101),"+
                "(10121,'Sonche',101),"+
                "(10201,'Bagua',102),"+
                "(10202,'Aramango',102),"+
                "(10203,'Copallin',102),"+
                "(10204,'El Parco',102),"+
                "(10205,'Imaza',102),"+
                "(10206,'La Peca',102),"+
                "(10301,'Jumbilla',103),"+
                "(10302,'Chisquilla',103),"+
                "(10303,'Churuja',103),"+
                "(10304,'Corosha',103),"+
                "(10305,'Cuispes',103),"+
                "(10306,'Florida',103),"+
                "(10307,'Jazan',103),"+
                "(10308,'Recta',103),"+
                "(10309,'San Carlos',103),"+
                "(10310,'Shipasbamba',103),"+
                "(10311,'Valera',103),"+
                "(10312,'Yambrasbamba',103),"+
                "(10401,'Nieva',104),"+
                "(10402,'El Cenepa',104),"+
                "(10403,'RÃ­o Santiago',104),"+
                "(10501,'Lamud',105),"+
                "(10502,'Camporredondo',105),"+
                "(10503,'Cocabamba',105),"+
                "(10504,'Colcamar',105),"+
                "(10505,'Conila',105),"+
                "(10506,'Inguilpata',105),"+
                "(10507,'Longuita',105),"+
                "(10508,'Lonya Chico',105),"+
                "(10509,'Luya',105),"+
                "(10510,'Luya Viejo',105),"+
                "(10511,'MarÃ­a',105),"+
                "(10512,'Ocalli',105),"+
                "(10513,'Ocumal',105),"+
                "(10514,'Pisuquia',105),"+
                "(10515,'Providencia',105),"+
                "(10516,'San CristÃ³bal',105),"+
                "(10517,'San Francisco de Yeso',105),"+
                "(10518,'San JerÃ³nimo',105),"+
                "(10519,'San Juan de Lopecancha',105),"+
                "(10520,'Santa Catalina',105),"+
                "(10521,'Santo Tomas',105),"+
                "(10522,'Tingo',105),"+
                "(10523,'Trita',105),"+
                "(10601,'San NicolÃ¡s',106),"+
                "(10602,'Chirimoto',106),"+
                "(10603,'Cochamal',106),"+
                "(10604,'Huambo',106),"+
                "(10605,'Limabamba',106),"+
                "(10606,'Longar',106),"+
                "(10607,'Mariscal Benavides',106),"+
                "(10608,'Milpuc',106),"+
                "(10609,'Omia',106),"+
                "(10610,'Santa Rosa',106),"+
                "(10611,'Totora',106),"+
                "(10612,'Vista Alegre',106),"+
                "(10701,'Bagua Grande',107),"+
                "(10702,'Cajaruro',107),"+
                "(10703,'Cumba',107),"+
                "(10704,'El Milagro',107),"+
                "(10705,'Jamalca',107),"+
                "(10706,'Lonya Grande',107),"+
                "(10707,'Yamon',107),"+
                "(20101,'Huaraz',201),"+
                "(20102,'Cochabamba',201),"+
                "(20103,'Colcabamba',201),"+
                "(20104,'Huanchay',201),"+
                "(20105,'Independencia',201),"+
                "(20106,'Jangas',201),"+
                "(20107,'La Libertad',201),"+
                "(20108,'Olleros',201),"+
                "(20109,'Pampas Grande',201),"+
                "(20110,'Pariacoto',201),"+
                "(20111,'Pira',201),"+
                "(20112,'Tarica',201),"+
                "(20201,'Aija',202),"+
                "(20202,'Coris',202),"+
                "(20203,'Huacllan',202),"+
                "(20204,'La Merced',202),"+
                "(20205,'Succha',202),"+
                "(20301,'Llamellin',203),"+
                "(20302,'Aczo',203),"+
                "(20303,'Chaccho',203),"+
                "(20304,'Chingas',203),"+
                "(20305,'Mirgas',203),"+
                "(20306,'San Juan de Rontoy',203),"+
                "(20401,'Chacas',204),"+
                "(20402,'Acochaca',204),"+
                "(20501,'Chiquian',205),"+
                "(20502,'Abelardo Pardo Lezameta',205),"+
                "(20503,'Antonio Raymondi',205),"+
                "(20504,'Aquia',205),"+
                "(20505,'Cajacay',205),"+
                "(20506,'Canis',205),"+
                "(20507,'Colquioc',205),"+
                "(20508,'Huallanca',205),"+
                "(20509,'Huasta',205),"+
                "(20510,'Huayllacayan',205),"+
                "(20511,'La Primavera',205),"+
                "(20512,'Mangas',205),"+
                "(20513,'Pacllon',205),"+
                "(20514,'San Miguel de Corpanqui',205),"+
                "(20515,'Ticllos',205),"+
                "(20601,'Carhuaz',206),"+
                "(20602,'Acopampa',206),"+
                "(20603,'Amashca',206),"+
                "(20604,'Anta',206),"+
                "(20605,'Ataquero',206),"+
                "(20606,'Marcara',206),"+
                "(20607,'Pariahuanca',206),"+
                "(20608,'San Miguel de Aco',206),"+
                "(20609,'Shilla',206),"+
                "(20610,'Tinco',206),"+
                "(20611,'Yungar',206),"+
                "(20701,'San Luis',207),"+
                "(20702,'San NicolÃ¡s',207),"+
                "(20703,'Yauya',207),"+
                "(20801,'Casma',208),"+
                "(20802,'Buena Vista Alta',208),"+
                "(20803,'Comandante Noel',208),"+
                "(20804,'Yautan',208),"+
                "(20901,'Corongo',209),"+
                "(20902,'Aco',209),"+
                "(20903,'Bambas',209),"+
                "(20904,'Cusca',209),"+
                "(20905,'La Pampa',209),"+
                "(20906,'Yanac',209),"+
                "(20907,'Yupan',209),"+
                "(21001,'Huari',210),"+
                "(21002,'Anra',210),"+
                "(21003,'Cajay',210),"+
                "(21004,'Chavin de Huantar',210),"+
                "(21005,'Huacachi',210),"+
                "(21006,'Huacchis',210),"+
                "(21007,'Huachis',210),"+
                "(21008,'Huantar',210),"+
                "(21009,'Masin',210),"+
                "(21010,'Paucas',210),"+
                "(21011,'Ponto',210),"+
                "(21012,'Rahuapampa',210),"+
                "(21013,'Rapayan',210),"+
                "(21014,'San Marcos',210),"+
                "(21015,'San Pedro de Chana',210),"+
                "(21016,'Uco',210),"+
                "(21101,'Huarmey',211),"+
                "(21102,'Cochapeti',211),"+
                "(21103,'Culebras',211),"+
                "(21104,'Huayan',211),"+
                "(21105,'Malvas',211),"+
                "(21201,'Caraz',212),"+
                "(21202,'Huallanca',212),"+
                "(21203,'Huata',212),"+
                "(21204,'Huaylas',212),"+
                "(21205,'Mato',212),"+
                "(21206,'Pamparomas',212),"+
                "(21207,'Pueblo Libre',212),"+
                "(21208,'Santa Cruz',212),"+
                "(21209,'Santo Toribio',212),"+
                "(21210,'Yuracmarca',212),"+
                "(21301,'Piscobamba',213),"+
                "(21302,'Casca',213),"+
                "(21303,'Eleazar GuzmÃ¡n Barron',213),"+
                "(21304,'Fidel Olivas Escudero',213),"+
                "(21305,'Llama',213),"+
                "(21306,'Llumpa',213),"+
                "(21307,'Lucma',213),"+
                "(21308,'Musga',213),"+
                "(21401,'Ocros',214),"+
                "(21402,'Acas',214),"+
                "(21403,'Cajamarquilla',214),"+
                "(21404,'Carhuapampa',214),"+
                "(21405,'Cochas',214),"+
                "(21406,'Congas',214),"+
                "(21407,'Llipa',214),"+
                "(21408,'San CristÃ³bal de Rajan',214),"+
                "(21409,'San Pedro',214),"+
                "(21410,'Santiago de Chilcas',214),"+
                "(21501,'Cabana',215),"+
                "(21502,'Bolognesi',215),"+
                "(21503,'Conchucos',215),"+
                "(21504,'Huacaschuque',215),"+
                "(21505,'Huandoval',215),"+
                "(21506,'Lacabamba',215),"+
                "(21507,'Llapo',215),"+
                "(21508,'Pallasca',215),"+
                "(21509,'Pampas',215),"+
                "(21510,'Santa Rosa',215),"+
                "(21511,'Tauca',215),"+
                "(21601,'Pomabamba',216),"+
                "(21602,'Huayllan',216),"+
                "(21603,'Parobamba',216),"+
                "(21604,'Quinuabamba',216),"+
                "(21701,'Recuay',217),"+
                "(21702,'Catac',217),"+
                "(21703,'Cotaparaco',217),"+
                "(21704,'Huayllapampa',217),"+
                "(21705,'Llacllin',217),"+
                "(21706,'Marca',217),"+
                "(21707,'Pampas Chico',217),"+
                "(21708,'Pararin',217),"+
                "(21709,'Tapacocha',217),"+
                "(21710,'Ticapampa',217),"+
                "(21801,'Chimbote',218),"+
                "(21802,'CÃ¡ceres del PerÃº',218),"+
                "(21803,'Coishco',218),"+
                "(21804,'Macate',218),"+
                "(21805,'Moro',218),"+
                "(21806,'NepeÃ±a',218),"+
                "(21807,'Samanco',218),"+
                "(21808,'Santa',218),"+
                "(21809,'Nuevo Chimbote',218),"+
                "(21901,'Sihuas',219),"+
                "(21902,'Acobamba',219),"+
                "(21903,'Alfonso Ugarte',219),"+
                "(21904,'Cashapampa',219),"+
                "(21905,'Chingalpo',219),"+
                "(21906,'Huayllabamba',219),"+
                "(21907,'Quiches',219),"+
                "(21908,'Ragash',219),"+
                "(21909,'San Juan',219),"+
                "(21910,'Sicsibamba',219),"+
                "(22001,'Yungay',220),"+
                "(22002,'Cascapara',220),"+
                "(22003,'Mancos',220),"+
                "(22004,'Matacoto',220),"+
                "(22005,'Quillo',220),"+
                "(22006,'Ranrahirca',220),"+
                "(22007,'Shupluy',220),"+
                "(22008,'Yanama',220),"+
                "(30101,'Abancay',301),"+
                "(30102,'Chacoche',301),"+
                "(30103,'Circa',301),"+
                "(30104,'Curahuasi',301),"+
                "(30105,'Huanipaca',301),"+
                "(30106,'Lambrama',301),"+
                "(30107,'Pichirhua',301),"+
                "(30108,'San Pedro de Cachora',301),"+
                "(30109,'Tamburco',301),"+
                "(30201,'Andahuaylas',302),"+
                "(30202,'Andarapa',302),"+
                "(30203,'Chiara',302),"+
                "(30204,'Huancarama',302),"+
                "(30205,'Huancaray',302),"+
                "(30206,'Huayana',302),"+
                "(30207,'Kishuara',302),"+
                "(30208,'Pacobamba',302),"+
                "(30209,'Pacucha',302),"+
                "(30210,'Pampachiri',302),"+
                "(30211,'Pomacocha',302),"+
                "(30212,'San Antonio de Cachi',302),"+
                "(30213,'San JerÃ³nimo',302),"+
                "(30214,'San Miguel de Chaccrampa',302),"+
                "(30215,'Santa MarÃ­a de Chicmo',302),"+
                "(30216,'Talavera',302),"+
                "(30217,'Tumay Huaraca',302),"+
                "(30218,'Turpo',302),"+
                "(30219,'Kaquiabamba',302),"+
                "(30220,'JosÃ© MarÃ­a Arguedas',302),"+
                "(30301,'Antabamba',303),"+
                "(30302,'El Oro',303),"+
                "(30303,'Huaquirca',303),"+
                "(30304,'Juan Espinoza Medrano',303),"+
                "(30305,'Oropesa',303),"+
                "(30306,'Pachaconas',303),"+
                "(30307,'Sabaino',303),"+
                "(30401,'Chalhuanca',304),"+
                "(30402,'Capaya',304),"+
                "(30403,'Caraybamba',304),"+
                "(30404,'Chapimarca',304),"+
                "(30405,'Colcabamba',304),"+
                "(30406,'Cotaruse',304),"+
                "(30407,'Ihuayllo',304),"+
                "(30408,'Justo Apu Sahuaraura',304),"+
                "(30409,'Lucre',304),"+
                "(30410,'Pocohuanca',304),"+
                "(30411,'San Juan de ChacÃ±a',304),"+
                "(30412,'SaÃ±ayca',304),"+
                "(30413,'Soraya',304),"+
                "(30414,'Tapairihua',304),"+
                "(30415,'Tintay',304),"+
                "(30416,'Toraya',304),"+
                "(30417,'Yanaca',304),"+
                "(30501,'Tambobamba',305),"+
                "(30502,'Cotabambas',305),"+
                "(30503,'Coyllurqui',305),"+
                "(30504,'Haquira',305),"+
                "(30505,'Mara',305),"+
                "(30506,'Challhuahuacho',305),"+
                "(30601,'Chincheros',306),"+
                "(30602,'Anco_Huallo',306),"+
                "(30603,'Cocharcas',306),"+
                "(30604,'Huaccana',306),"+
                "(30605,'Ocobamba',306),"+
                "(30606,'Ongoy',306),"+
                "(30607,'Uranmarca',306),"+
                "(30608,'Ranracancha',306),"+
                "(30609,'Rocchacc',306),"+
                "(30610,'El Porvenir',306),"+
                "(30611,'Los Chankas',306),"+
                "(30701,'Chuquibambilla',307),"+
                "(30702,'Curpahuasi',307),"+
                "(30703,'Gamarra',307),"+
                "(30704,'Huayllati',307),"+
                "(30705,'Mamara',307),"+
                "(30706,'Micaela Bastidas',307),"+
                "(30707,'Pataypampa',307),"+
                "(30708,'Progreso',307),"+
                "(30709,'San Antonio',307),"+
                "(30710,'Santa Rosa',307),"+
                "(30711,'Turpay',307),"+
                "(30712,'Vilcabamba',307),"+
                "(30713,'Virundo',307),"+
                "(30714,'Curasco',307),"+
                "(40101,'Arequipa',401),"+
                "(40102,'Alto Selva Alegre',401),"+
                "(40103,'Cayma',401),"+
                "(40104,'Cerro Colorado',401),"+
                "(40105,'Characato',401),"+
                "(40106,'Chiguata',401),"+
                "(40107,'Jacobo Hunter',401),"+
                "(40108,'La Joya',401),"+
                "(40109,'Mariano Melgar',401),"+
                "(40110,'Miraflores',401),"+
                "(40111,'Mollebaya',401),"+
                "(40112,'Paucarpata',401),"+
                "(40113,'Pocsi',401),"+
                "(40114,'Polobaya',401),"+
                "(40115,'QuequeÃ±a',401),"+
                "(40116,'Sabandia',401),"+
                "(40117,'Sachaca',401),"+
                "(40118,'San Juan de Siguas',401),"+
                "(40119,'San Juan de Tarucani',401),"+
                "(40120,'Santa Isabel de Siguas',401),"+
                "(40121,'Santa Rita de Siguas',401),"+
                "(40122,'Socabaya',401),"+
                "(40123,'Tiabaya',401),"+
                "(40124,'Uchumayo',401),"+
                "(40125,'Vitor',401),"+
                "(40126,'Yanahuara',401),"+
                "(40127,'Yarabamba',401),"+
                "(40128,'Yura',401),"+
                "(40129,'JosÃ© Luis Bustamante Y Rivero',401),"+
                "(40201,'CamanÃ¡',402),"+
                "(40202,'JosÃ© MarÃ­a Quimper',402),"+
                "(40203,'Mariano NicolÃ¡s ValcÃ¡rcel',402),"+
                "(40204,'Mariscal CÃ¡ceres',402),"+
                "(40205,'NicolÃ¡s de Pierola',402),"+
                "(40206,'OcoÃ±a',402),"+
                "(40207,'Quilca',402),"+
                "(40208,'Samuel Pastor',402),"+
                "(40301,'CaravelÃ­',403),"+
                "(40302,'AcarÃ­',403),"+
                "(40303,'Atico',403),"+
                "(40304,'Atiquipa',403),"+
                "(40305,'Bella UniÃ³n',403),"+
                "(40306,'Cahuacho',403),"+
                "(40307,'Chala',403),"+
                "(40308,'Chaparra',403),"+
                "(40309,'Huanuhuanu',403),"+
                "(40310,'Jaqui',403),"+
                "(40311,'Lomas',403),"+
                "(40312,'Quicacha',403),"+
                "(40313,'Yauca',403),"+
                "(40401,'Aplao',404),"+
                "(40402,'Andagua',404),"+
                "(40403,'Ayo',404),"+
                "(40404,'Chachas',404),"+
                "(40405,'Chilcaymarca',404),"+
                "(40406,'Choco',404),"+
                "(40407,'Huancarqui',404),"+
                "(40408,'Machaguay',404),"+
                "(40409,'Orcopampa',404),"+
                "(40410,'Pampacolca',404),"+
                "(40411,'Tipan',404),"+
                "(40412,'UÃ±on',404),"+
                "(40413,'Uraca',404),"+
                "(40414,'Viraco',404),"+
                "(40501,'Chivay',405),"+
                "(40502,'Achoma',405),"+
                "(40503,'Cabanaconde',405),"+
                "(40504,'Callalli',405),"+
                "(40505,'Caylloma',405),"+
                "(40506,'Coporaque',405),"+
                "(40507,'Huambo',405),"+
                "(40508,'Huanca',405),"+
                "(40509,'Ichupampa',405),"+
                "(40510,'Lari',405),"+
                "(40511,'Lluta',405),"+
                "(40512,'Maca',405),"+
                "(40513,'Madrigal',405),"+
                "(40514,'San Antonio de Chuca',405),"+
                "(40515,'Sibayo',405),"+
                "(40516,'Tapay',405),"+
                "(40517,'Tisco',405),"+
                "(40518,'Tuti',405),"+
                "(40519,'Yanque',405),"+
                "(40520,'Majes',405),"+
                "(40601,'Chuquibamba',406),"+
                "(40602,'Andaray',406),"+
                "(40603,'Cayarani',406),"+
                "(40604,'Chichas',406),"+
                "(40605,'Iray',406),"+
                "(40606,'RÃ­o Grande',406),"+
                "(40607,'Salamanca',406),"+
                "(40608,'Yanaquihua',406),"+
                "(40701,'Mollendo',407),"+
                "(40702,'Cocachacra',407),"+
                "(40703,'Dean Valdivia',407),"+
                "(40704,'Islay',407),"+
                "(40705,'Mejia',407),"+
                "(40706,'Punta de BombÃ³n',407),"+
                "(40801,'Cotahuasi',408),"+
                "(40802,'Alca',408),"+
                "(40803,'Charcana',408),"+
                "(40804,'Huaynacotas',408),"+
                "(40805,'Pampamarca',408),"+
                "(40806,'Puyca',408),"+
                "(40807,'Quechualla',408),"+
                "(40808,'Sayla',408),"+
                "(40809,'Tauria',408),"+
                "(40810,'Tomepampa',408),"+
                "(40811,'Toro',408),"+
                "(50101,'Ayacucho',501),"+
                "(50102,'Acocro',501),"+
                "(50103,'Acos Vinchos',501),"+
                "(50104,'Carmen Alto',501),"+
                "(50105,'Chiara',501),"+
                "(50106,'Ocros',501),"+
                "(50107,'Pacaycasa',501),"+
                "(50108,'Quinua',501),"+
                "(50109,'San JosÃ© de Ticllas',501),"+
                "(50110,'San Juan Bautista',501),"+
                "(50111,'Santiago de Pischa',501),"+
                "(50112,'Socos',501),"+
                "(50113,'Tambillo',501),"+
                "(50114,'Vinchos',501),"+
                "(50115,'JesÃºs Nazareno',501),"+
                "(50116,'AndrÃ©s Avelino CÃ¡ceres Dorregaray',501),"+
                "(50201,'Cangallo',502),"+
                "(50202,'Chuschi',502),"+
                "(50203,'Los Morochucos',502),"+
                "(50204,'MarÃ­a Parado de Bellido',502),"+
                "(50205,'Paras',502),"+
                "(50206,'Totos',502),"+
                "(50301,'Sancos',503),"+
                "(50302,'Carapo',503),"+
                "(50303,'Sacsamarca',503),"+
                "(50304,'Santiago de Lucanamarca',503),"+
                "(50401,'Huanta',504),"+
                "(50402,'Ayahuanco',504),"+
                "(50403,'Huamanguilla',504),"+
                "(50404,'Iguain',504),"+
                "(50405,'Luricocha',504),"+
                "(50406,'Santillana',504),"+
                "(50407,'Sivia',504),"+
                "(50408,'Llochegua',504),"+
                "(50409,'Canayre',504),"+
                "(50410,'Uchuraccay',504),"+
                "(50411,'Pucacolpa',504),"+
                "(50412,'Chaca',504),"+
                "(50501,'San Miguel',505),"+
                "(50502,'Anco',505),"+
                "(50503,'Ayna',505),"+
                "(50504,'Chilcas',505),"+
                "(50505,'Chungui',505),"+
                "(50506,'Luis Carranza',505),"+
                "(50507,'Santa Rosa',505),"+
                "(50508,'Tambo',505),"+
                "(50509,'Samugari',505),"+
                "(50510,'Anchihuay',505),"+
                "(50511,'Oronccoy',505),"+
                "(50601,'Puquio',506),"+
                "(50602,'Aucara',506),"+
                "(50603,'Cabana',506),"+
                "(50604,'Carmen Salcedo',506),"+
                "(50605,'ChaviÃ±a',506),"+
                "(50606,'Chipao',506),"+
                "(50607,'Huac-Huas',506),"+
                "(50608,'Laramate',506),"+
                "(50609,'Leoncio Prado',506),"+
                "(50610,'Llauta',506),"+
                "(50611,'Lucanas',506),"+
                "(50612,'OcaÃ±a',506),"+
                "(50613,'Otoca',506),"+
                "(50614,'Saisa',506),"+
                "(50615,'San CristÃ³bal',506),"+
                "(50616,'San Juan',506),"+
                "(50617,'San Pedro',506),"+
                "(50618,'San Pedro de Palco',506),"+
                "(50619,'Sancos',506),"+
                "(50620,'Santa Ana de Huaycahuacho',506),"+
                "(50621,'Santa Lucia',506),"+
                "(50701,'Coracora',507),"+
                "(50702,'Chumpi',507),"+
                "(50703,'Coronel CastaÃ±eda',507),"+
                "(50704,'Pacapausa',507),"+
                "(50705,'Pullo',507),"+
                "(50706,'Puyusca',507),"+
                "(50707,'San Francisco de Ravacayco',507),"+
                "(50708,'Upahuacho',507),"+
                "(50801,'Pausa',508),"+
                "(50802,'Colta',508),"+
                "(50803,'Corculla',508),"+
                "(50804,'Lampa',508),"+
                "(50805,'Marcabamba',508),"+
                "(50806,'Oyolo',508),"+
                "(50807,'Pararca',508),"+
                "(50808,'San Javier de Alpabamba',508),"+
                "(50809,'San JosÃ© de Ushua',508),"+
                "(50810,'Sara Sara',508),"+
                "(50901,'Querobamba',509),"+
                "(50902,'BelÃ©n',509),"+
                "(50903,'Chalcos',509),"+
                "(50904,'Chilcayoc',509),"+
                "(50905,'HuacaÃ±a',509),"+
                "(50906,'Morcolla',509),"+
                "(50907,'Paico',509),"+
                "(50908,'San Pedro de Larcay',509),"+
                "(50909,'San Salvador de Quije',509),"+
                "(50910,'Santiago de Paucaray',509),"+
                "(50911,'Soras',509),"+
                "(51001,'Huancapi',510),"+
                "(51002,'Alcamenca',510),"+
                "(51003,'Apongo',510),"+
                "(51004,'Asquipata',510),"+
                "(51005,'Canaria',510),"+
                "(51006,'Cayara',510),"+
                "(51007,'Colca',510),"+
                "(51008,'Huamanquiquia',510),"+
                "(51009,'Huancaraylla',510),"+
                "(51010,'Hualla',510),"+
                "(51011,'Sarhua',510),"+
                "(51012,'Vilcanchos',510),"+
                "(51101,'Vilcas Huaman',511),"+
                "(51102,'Accomarca',511),"+
                "(51103,'Carhuanca',511),"+
                "(51104,'ConcepciÃ³n',511),"+
                "(51105,'Huambalpa',511),"+
                "(51106,'Independencia',511),"+
                "(51107,'Saurama',511),"+
                "(51108,'Vischongo',511),"+
                "(60101,'Cajamarca',601),"+
                "(60102,'AsunciÃ³n',601),"+
                "(60103,'Chetilla',601),"+
                "(60104,'Cospan',601),"+
                "(60105,'EncaÃ±ada',601),"+
                "(60106,'JesÃºs',601),"+
                "(60107,'Llacanora',601),"+
                "(60108,'Los BaÃ±os del Inca',601),"+
                "(60109,'Magdalena',601),"+
                "(60110,'Matara',601),"+
                "(60111,'Namora',601),"+
                "(60112,'San Juan',601),"+
                "(60201,'Cajabamba',602),"+
                "(60202,'Cachachi',602),"+
                "(60203,'Condebamba',602),"+
                "(60204,'Sitacocha',602),"+
                "(60301,'CelendÃ­n',603),"+
                "(60302,'Chumuch',603),"+
                "(60303,'Cortegana',603),"+
                "(60304,'Huasmin',603),"+
                "(60305,'Jorge ChÃ¡vez',603),"+
                "(60306,'JosÃ© GÃ¡lvez',603),"+
                "(60307,'Miguel Iglesias',603),"+
                "(60308,'Oxamarca',603),"+
                "(60309,'Sorochuco',603),"+
                "(60310,'Sucre',603),"+
                "(60311,'Utco',603),"+
                "(60312,'La Libertad de Pallan',603),"+
                "(60401,'Chota',604),"+
                "(60402,'Anguia',604),"+
                "(60403,'Chadin',604),"+
                "(60404,'Chiguirip',604),"+
                "(60405,'Chimban',604),"+
                "(60406,'Choropampa',604),"+
                "(60407,'Cochabamba',604),"+
                "(60408,'Conchan',604),"+
                "(60409,'Huambos',604),"+
                "(60410,'Lajas',604),"+
                "(60411,'Llama',604),"+
                "(60412,'Miracosta',604),"+
                "(60413,'Paccha',604),"+
                "(60414,'Pion',604),"+
                "(60415,'Querocoto',604),"+
                "(60416,'San Juan de Licupis',604),"+
                "(60417,'Tacabamba',604),"+
                "(60418,'Tocmoche',604),"+
                "(60419,'Chalamarca',604),"+
                "(60501,'Contumaza',605),"+
                "(60502,'Chilete',605),"+
                "(60503,'Cupisnique',605),"+
                "(60504,'Guzmango',605),"+
                "(60505,'San Benito',605),"+
                "(60506,'Santa Cruz de Toledo',605),"+
                "(60507,'Tantarica',605),"+
                "(60508,'Yonan',605),"+
                "(60601,'Cutervo',606),"+
                "(60602,'Callayuc',606),"+
                "(60603,'Choros',606),"+
                "(60604,'Cujillo',606),"+
                "(60605,'La Ramada',606),"+
                "(60606,'Pimpingos',606),"+
                "(60607,'Querocotillo',606),"+
                "(60608,'San AndrÃ©s de Cutervo',606),"+
                "(60609,'San Juan de Cutervo',606),"+
                "(60610,'San Luis de Lucma',606),"+
                "(60611,'Santa Cruz',606),"+
                "(60612,'Santo Domingo de la Capilla',606),"+
                "(60613,'Santo Tomas',606),"+
                "(60614,'Socota',606),"+
                "(60615,'Toribio Casanova',606),"+
                "(60701,'Bambamarca',607),"+
                "(60702,'Chugur',607),"+
                "(60703,'Hualgayoc',607),"+
                "(60801,'JaÃ©n',608),"+
                "(60802,'Bellavista',608),"+
                "(60803,'Chontali',608),"+
                "(60804,'Colasay',608),"+
                "(60805,'Huabal',608),"+
                "(60806,'Las Pirias',608),"+
                "(60807,'Pomahuaca',608),"+
                "(60808,'Pucara',608),"+
                "(60809,'Sallique',608),"+
                "(60810,'San Felipe',608),"+
                "(60811,'San JosÃ© del Alto',608),"+
                "(60812,'Santa Rosa',608),"+
                "(60901,'San Ignacio',609),"+
                "(60902,'Chirinos',609),"+
                "(60903,'Huarango',609),"+
                "(60904,'La Coipa',609),"+
                "(60905,'Namballe',609),"+
                "(60906,'San JosÃ© de Lourdes',609),"+
                "(60907,'Tabaconas',609),"+
                "(61001,'Pedro GÃ¡lvez',610),"+
                "(61002,'Chancay',610),"+
                "(61003,'Eduardo Villanueva',610),"+
                "(61004,'Gregorio Pita',610),"+
                "(61005,'Ichocan',610),"+
                "(61006,'JosÃ© Manuel Quiroz',610),"+
                "(61007,'JosÃ© Sabogal',610),"+
                "(61101,'San Miguel',611),"+
                "(61102,'BolÃ­var',611),"+
                "(61103,'Calquis',611),"+
                "(61104,'Catilluc',611),"+
                "(61105,'El Prado',611),"+
                "(61106,'La Florida',611),"+
                "(61107,'Llapa',611),"+
                "(61108,'Nanchoc',611),"+
                "(61109,'Niepos',611),"+
                "(61110,'San Gregorio',611),"+
                "(61111,'San Silvestre de Cochan',611),"+
                "(61112,'Tongod',611),"+
                "(61113,'UniÃ³n Agua Blanca',611),"+
                "(61201,'San Pablo',612),"+
                "(61202,'San Bernardino',612),"+
                "(61203,'San Luis',612),"+
                "(61204,'Tumbaden',612),"+
                "(61301,'Santa Cruz',613),"+
                "(61302,'Andabamba',613),"+
                "(61303,'Catache',613),"+
                "(61304,'ChancaybaÃ±os',613),"+
                "(61305,'La Esperanza',613),"+
                "(61306,'Ninabamba',613),"+
                "(61307,'Pulan',613),"+
                "(61308,'Saucepampa',613),"+
                "(61309,'Sexi',613),"+
                "(61310,'Uticyacu',613),"+
                "(61311,'Yauyucan',613),"+
                "(70101,'Callao',701),"+
                "(70102,'Bellavista',701),"+
                "(70103,'Carmen de la Legua Reynoso',701),"+
                "(70104,'La Perla',701),"+
                "(70105,'La Punta',701),"+
                "(70106,'Ventanilla',701),"+
                "(70107,'Mi PerÃº',701),"+
                "(80101,'Cusco',801),"+
                "(80102,'Ccorca',801),"+
                "(80103,'Poroy',801),"+
                "(80104,'San JerÃ³nimo',801),"+
                "(80105,'San Sebastian',801),"+
                "(80106,'Santiago',801),"+
                "(80107,'Saylla',801),"+
                "(80108,'Wanchaq',801),"+
                "(80201,'Acomayo',802),"+
                "(80202,'Acopia',802),"+
                "(80203,'Acos',802),"+
                "(80204,'Mosoc Llacta',802),"+
                "(80205,'Pomacanchi',802),"+
                "(80206,'Rondocan',802),"+
                "(80207,'Sangarara',802),"+
                "(80301,'Anta',803),"+
                "(80302,'Ancahuasi',803),"+
                "(80303,'Cachimayo',803),"+
                "(80304,'Chinchaypujio',803),"+
                "(80305,'Huarocondo',803),"+
                "(80306,'Limatambo',803),"+
                "(80307,'Mollepata',803),"+
                "(80308,'Pucyura',803),"+
                "(80309,'Zurite',803),"+
                "(80401,'Calca',804),"+
                "(80402,'Coya',804),"+
                "(80403,'Lamay',804),"+
                "(80404,'Lares',804),"+
                "(80405,'Pisac',804),"+
                "(80406,'San Salvador',804),"+
                "(80407,'Taray',804),"+
                "(80408,'Yanatile',804),"+
                "(80501,'Yanaoca',805),"+
                "(80502,'Checca',805),"+
                "(80503,'Kunturkanki',805),"+
                "(80504,'Langui',805),"+
                "(80505,'Layo',805),"+
                "(80506,'Pampamarca',805),"+
                "(80507,'Quehue',805),"+
                "(80508,'Tupac Amaru',805),"+
                "(80601,'Sicuani',806),"+
                "(80602,'Checacupe',806),"+
                "(80603,'Combapata',806),"+
                "(80604,'Marangani',806),"+
                "(80605,'Pitumarca',806),"+
                "(80606,'San Pablo',806),"+
                "(80607,'San Pedro',806),"+
                "(80608,'Tinta',806),"+
                "(80701,'Santo Tomas',807),"+
                "(80702,'Capacmarca',807),"+
                "(80703,'Chamaca',807),"+
                "(80704,'Colquemarca',807),"+
                "(80705,'Livitaca',807),"+
                "(80706,'Llusco',807),"+
                "(80707,'QuiÃ±ota',807),"+
                "(80708,'Velille',807),"+
                "(80801,'Espinar',808),"+
                "(80802,'Condoroma',808),"+
                "(80803,'Coporaque',808),"+
                "(80804,'Ocoruro',808),"+
                "(80805,'Pallpata',808),"+
                "(80806,'Pichigua',808),"+
                "(80807,'Suyckutambo',808),"+
                "(80808,'Alto Pichigua',808),"+
                "(80901,'Santa Ana',809),"+
                "(80902,'Echarate',809),"+
                "(80903,'Huayopata',809),"+
                "(80904,'Maranura',809),"+
                "(80905,'Ocobamba',809),"+
                "(80906,'Quellouno',809),"+
                "(80907,'Kimbiri',809),"+
                "(80908,'Santa Teresa',809),"+
                "(80909,'Vilcabamba',809),"+
                "(80910,'Pichari',809),"+
                "(80911,'Inkawasi',809),"+
                "(80912,'Villa Virgen',809),"+
                "(80913,'Villa Kintiarina',809),"+
                "(80914,'Megantoni',809),"+
                "(81001,'Paruro',810),"+
                "(81002,'Accha',810),"+
                "(81003,'Ccapi',810),"+
                "(81004,'Colcha',810),"+
                "(81005,'Huanoquite',810),"+
                "(81006,'OmachaÃ§',810),"+
                "(81007,'Paccaritambo',810),"+
                "(81008,'Pillpinto',810),"+
                "(81009,'Yaurisque',810),"+
                "(81101,'Paucartambo',811),"+
                "(81102,'Caicay',811),"+
                "(81103,'Challabamba',811),"+
                "(81104,'Colquepata',811),"+
                "(81105,'Huancarani',811),"+
                "(81106,'KosÃ±ipata',811),"+
                "(81201,'Urcos',812),"+
                "(81202,'Andahuaylillas',812),"+
                "(81203,'Camanti',812),"+
                "(81204,'Ccarhuayo',812),"+
                "(81205,'Ccatca',812),"+
                "(81206,'Cusipata',812),"+
                "(81207,'Huaro',812),"+
                "(81208,'Lucre',812),"+
                "(81209,'Marcapata',812),"+
                "(81210,'Ocongate',812),"+
                "(81211,'Oropesa',812),"+
                "(81212,'Quiquijana',812),"+
                "(81301,'Urubamba',813),"+
                "(81302,'Chinchero',813),"+
                "(81303,'Huayllabamba',813),"+
                "(81304,'Machupicchu',813),"+
                "(81305,'Maras',813),"+
                "(81306,'Ollantaytambo',813),"+
                "(81307,'Yucay',813),"+
                "(90101,'Huancavelica',901),"+
                "(90102,'Acobambilla',901),"+
                "(90103,'Acoria',901),"+
                "(90104,'Conayca',901),"+
                "(90105,'Cuenca',901),"+
                "(90106,'Huachocolpa',901),"+
                "(90107,'Huayllahuara',901),"+
                "(90108,'Izcuchaca',901),"+
                "(90109,'Laria',901),"+
                "(90110,'Manta',901),"+
                "(90111,'Mariscal CÃ¡ceres',901),"+
                "(90112,'Moya',901),"+
                "(90113,'Nuevo Occoro',901),"+
                "(90114,'Palca',901),"+
                "(90115,'Pilchaca',901),"+
                "(90116,'Vilca',901),"+
                "(90117,'Yauli',901),"+
                "(90118,'AscensiÃ³n',901),"+
                "(90119,'Huando',901),"+
                "(90201,'Acobamba',902),"+
                "(90202,'Andabamba',902),"+
                "(90203,'Anta',902),"+
                "(90204,'Caja',902),"+
                "(90205,'Marcas',902),"+
                "(90206,'Paucara',902),"+
                "(90207,'Pomacocha',902),"+
                "(90208,'Rosario',902),"+
                "(90301,'Lircay',903),"+
                "(90302,'Anchonga',903),"+
                "(90303,'Callanmarca',903),"+
                "(90304,'Ccochaccasa',903),"+
                "(90305,'Chincho',903),"+
                "(90306,'Congalla',903),"+
                "(90307,'Huanca-Huanca',903),"+
                "(90308,'Huayllay Grande',903),"+
                "(90309,'Julcamarca',903),"+
                "(90310,'San Antonio de Antaparco',903),"+
                "(90311,'Santo Tomas de Pata',903),"+
                "(90312,'Secclla',903),"+
                "(90401,'Castrovirreyna',904),"+
                "(90402,'Arma',904),"+
                "(90403,'Aurahua',904),"+
                "(90404,'Capillas',904),"+
                "(90405,'Chupamarca',904),"+
                "(90406,'Cocas',904),"+
                "(90407,'Huachos',904),"+
                "(90408,'Huamatambo',904),"+
                "(90409,'Mollepampa',904),"+
                "(90410,'San Juan',904),"+
                "(90411,'Santa Ana',904),"+
                "(90412,'Tantara',904),"+
                "(90413,'Ticrapo',904),"+
                "(90501,'Churcampa',905),"+
                "(90502,'Anco',905),"+
                "(90503,'Chinchihuasi',905),"+
                "(90504,'El Carmen',905),"+
                "(90505,'La Merced',905),"+
                "(90506,'Locroja',905),"+
                "(90507,'Paucarbamba',905),"+
                "(90508,'San Miguel de Mayocc',905),"+
                "(90509,'San Pedro de Coris',905),"+
                "(90510,'Pachamarca',905),"+
                "(90511,'Cosme',905),"+
                "(90601,'Huaytara',906),"+
                "(90602,'Ayavi',906),"+
                "(90603,'CÃ³rdova',906),"+
                "(90604,'Huayacundo Arma',906),"+
                "(90605,'Laramarca',906),"+
                "(90606,'Ocoyo',906),"+
                "(90607,'Pilpichaca',906),"+
                "(90608,'Querco',906),"+
                "(90609,'Quito-Arma',906),"+
                "(90610,'San Antonio de Cusicancha',906),"+
                "(90611,'San Francisco de Sangayaico',906),"+
                "(90612,'San Isidro',906),"+
                "(90613,'Santiago de Chocorvos',906),"+
                "(90614,'Santiago de Quirahuara',906),"+
                "(90615,'Santo Domingo de Capillas',906),"+
                "(90616,'Tambo',906),"+
                "(90701,'Pampas',907),"+
                "(90702,'Acostambo',907),"+
                "(90703,'Acraquia',907),"+
                "(90704,'Ahuaycha',907),"+
                "(90705,'Colcabamba',907),"+
                "(90706,'Daniel HernÃ¡ndez',907),"+
                "(90707,'Huachocolpa',907),"+
                "(90709,'Huaribamba',907),"+
                "(90710,'Ã‘ahuimpuquio',907),"+
                "(90711,'Pazos',907),"+
                "(90713,'Quishuar',907),"+
                "(90714,'Salcabamba',907),"+
                "(90715,'Salcahuasi',907),"+
                "(90716,'San Marcos de Rocchac',907),"+
                "(90717,'Surcubamba',907),"+
                "(90718,'Tintay Puncu',907),"+
                "(90719,'Quichuas',907),"+
                "(90720,'Andaymarca',907),"+
                "(90721,'Roble',907),"+
                "(90722,'Pichos',907),"+
                "(90723,'Santiago de Tucuma',907),"+
                "(100101,'Huanuco',1001),"+
                "(100102,'Amarilis',1001),"+
                "(100103,'Chinchao',1001),"+
                "(100104,'Churubamba',1001),"+
                "(100105,'Margos',1001),"+
                "(100106,'Quisqui (Kichki)',1001),"+
                "(100107,'San Francisco de Cayran',1001),"+
                "(100108,'San Pedro de Chaulan',1001),"+
                "(100109,'Santa MarÃ­a del Valle',1001),"+
                "(100110,'Yarumayo',1001),"+
                "(100111,'Pillco Marca',1001),"+
                "(100112,'Yacus',1001),"+
                "(100113,'San Pablo de Pillao',1001),"+
                "(100201,'Ambo',1002),"+
                "(100202,'Cayna',1002),"+
                "(100203,'Colpas',1002),"+
                "(100204,'Conchamarca',1002),"+
                "(100205,'Huacar',1002),"+
                "(100206,'San Francisco',1002),"+
                "(100207,'San Rafael',1002),"+
                "(100208,'Tomay Kichwa',1002),"+
                "(100301,'La UniÃ³n',1003),"+
                "(100307,'Chuquis',1003),"+
                "(100311,'MarÃ­as',1003),"+
                "(100313,'Pachas',1003),"+
                "(100316,'Quivilla',1003),"+
                "(100317,'Ripan',1003),"+
                "(100321,'Shunqui',1003),"+
                "(100322,'Sillapata',1003),"+
                "(100323,'Yanas',1003),"+
                "(100401,'Huacaybamba',1004),"+
                "(100402,'Canchabamba',1004),"+
                "(100403,'Cochabamba',1004),"+
                "(100404,'Pinra',1004),"+
                "(100501,'Llata',1005),"+
                "(100502,'Arancay',1005),"+
                "(100503,'ChavÃ­n de Pariarca',1005),"+
                "(100504,'Jacas Grande',1005),"+
                "(100505,'Jircan',1005),"+
                "(100506,'Miraflores',1005),"+
                "(100507,'MonzÃ³n',1005),"+
                "(100508,'Punchao',1005),"+
                "(100509,'PuÃ±os',1005),"+
                "(100510,'Singa',1005),"+
                "(100511,'Tantamayo',1005),"+
                "(100601,'Rupa-Rupa',1006),"+
                "(100602,'Daniel AlomÃ­a Robles',1006),"+
                "(100603,'HermÃ­lio Valdizan',1006),"+
                "(100604,'JosÃ© Crespo y Castillo',1006),"+
                "(100605,'Luyando',1006),"+
                "(100606,'Mariano Damaso Beraun',1006),"+
                "(100607,'Pucayacu',1006),"+
                "(100608,'Castillo Grande',1006),"+
                "(100609,'Pueblo Nuevo',1006),"+
                "(100610,'Santo Domingo de Anda',1006),"+
                "(100701,'Huacrachuco',1007),"+
                "(100702,'Cholon',1007),"+
                "(100703,'San Buenaventura',1007),"+
                "(100704,'La Morada',1007),"+
                "(100705,'Santa Rosa de Alto Yanajanca',1007),"+
                "(100801,'Panao',1008),"+
                "(100802,'Chaglla',1008),"+
                "(100803,'Molino',1008),"+
                "(100804,'Umari',1008),"+
                "(100901,'Puerto Inca',1009),"+
                "(100902,'Codo del Pozuzo',1009),"+
                "(100903,'Honoria',1009),"+
                "(100904,'Tournavista',1009),"+
                "(100905,'Yuyapichis',1009),"+
                "(101001,'JesÃºs',1010),"+
                "(101002,'BaÃ±os',1010),"+
                "(101003,'Jivia',1010),"+
                "(101004,'Queropalca',1010),"+
                "(101005,'Rondos',1010),"+
                "(101006,'San Francisco de AsÃ­s',1010),"+
                "(101007,'San Miguel de Cauri',1010),"+
                "(101101,'Chavinillo',1011),"+
                "(101102,'Cahuac',1011),"+
                "(101103,'Chacabamba',1011),"+
                "(101104,'Aparicio Pomares',1011),"+
                "(101105,'Jacas Chico',1011),"+
                "(101106,'Obas',1011),"+
                "(101107,'Pampamarca',1011),"+
                "(101108,'Choras',1011),"+
                "(110101,'Ica',1101),"+
                "(110102,'La TinguiÃ±a',1101),"+
                "(110103,'Los Aquijes',1101),"+
                "(110104,'Ocucaje',1101),"+
                "(110105,'Pachacutec',1101),"+
                "(110106,'Parcona',1101),"+
                "(110107,'Pueblo Nuevo',1101),"+
                "(110108,'Salas',1101),"+
                "(110109,'San JosÃ© de Los Molinos',1101),"+
                "(110110,'San Juan Bautista',1101),"+
                "(110111,'Santiago',1101),"+
                "(110112,'Subtanjalla',1101),"+
                "(110113,'Tate',1101),"+
                "(110114,'Yauca del Rosario',1101),"+
                "(110201,'Chincha Alta',1102),"+
                "(110202,'Alto Laran',1102),"+
                "(110203,'Chavin',1102),"+
                "(110204,'Chincha Baja',1102),"+
                "(110205,'El Carmen',1102),"+
                "(110206,'Grocio Prado',1102),"+
                "(110207,'Pueblo Nuevo',1102),"+
                "(110208,'San Juan de Yanac',1102),"+
                "(110209,'San Pedro de Huacarpana',1102),"+
                "(110210,'Sunampe',1102),"+
                "(110211,'Tambo de Mora',1102),"+
                "(110301,'Nasca',1103),"+
                "(110302,'Changuillo',1103),"+
                "(110303,'El Ingenio',1103),"+
                "(110304,'Marcona',1103),"+
                "(110305,'Vista Alegre',1103),"+
                "(110401,'Palpa',1104),"+
                "(110402,'Llipata',1104),"+
                "(110403,'RÃ­o Grande',1104),"+
                "(110404,'Santa Cruz',1104),"+
                "(110405,'Tibillo',1104),"+
                "(110501,'Pisco',1105),"+
                "(110502,'Huancano',1105),"+
                "(110503,'Humay',1105),"+
                "(110504,'Independencia',1105),"+
                "(110505,'Paracas',1105),"+
                "(110506,'San AndrÃ©s',1105),"+
                "(110507,'San Clemente',1105),"+
                "(110508,'Tupac Amaru Inca',1105),"+
                "(120101,'Huancayo',1201),"+
                "(120104,'Carhuacallanga',1201),"+
                "(120105,'Chacapampa',1201),"+
                "(120106,'Chicche',1201),"+
                "(120107,'Chilca',1201),"+
                "(120108,'Chongos Alto',1201),"+
                "(120111,'Chupuro',1201),"+
                "(120112,'Colca',1201),"+
                "(120113,'Cullhuas',1201),"+
                "(120114,'El Tambo',1201),"+
                "(120116,'Huacrapuquio',1201),"+
                "(120117,'Hualhuas',1201),"+
                "(120119,'Huancan',1201),"+
                "(120120,'Huasicancha',1201),"+
                "(120121,'Huayucachi',1201),"+
                "(120122,'Ingenio',1201),"+
                "(120124,'Pariahuanca',1201),"+
                "(120125,'Pilcomayo',1201),"+
                "(120126,'Pucara',1201),"+
                "(120127,'Quichuay',1201),"+
                "(120128,'Quilcas',1201),"+
                "(120129,'San AgustÃ­n',1201),"+
                "(120130,'San JerÃ³nimo de Tunan',1201),"+
                "(120132,'SaÃ±o',1201),"+
                "(120133,'Sapallanga',1201),"+
                "(120134,'Sicaya',1201),"+
                "(120135,'Santo Domingo de Acobamba',1201),"+
                "(120136,'Viques',1201),"+
                "(120201,'ConcepciÃ³n',1202),"+
                "(120202,'Aco',1202),"+
                "(120203,'Andamarca',1202),"+
                "(120204,'Chambara',1202),"+
                "(120205,'Cochas',1202),"+
                "(120206,'Comas',1202),"+
                "(120207,'HeroÃ­nas Toledo',1202),"+
                "(120208,'Manzanares',1202),"+
                "(120209,'Mariscal Castilla',1202),"+
                "(120210,'Matahuasi',1202),"+
                "(120211,'Mito',1202),"+
                "(120212,'Nueve de Julio',1202),"+
                "(120213,'Orcotuna',1202),"+
                "(120214,'San JosÃ© de Quero',1202),"+
                "(120215,'Santa Rosa de Ocopa',1202),"+
                "(120301,'Chanchamayo',1203),"+
                "(120302,'Perene',1203),"+
                "(120303,'Pichanaqui',1203),"+
                "(120304,'San Luis de Shuaro',1203),"+
                "(120305,'San RamÃ³n',1203),"+
                "(120306,'Vitoc',1203),"+
                "(120401,'Jauja',1204),"+
                "(120402,'Acolla',1204),"+
                "(120403,'Apata',1204),"+
                "(120404,'Ataura',1204),"+
                "(120405,'Canchayllo',1204),"+
                "(120406,'Curicaca',1204),"+
                "(120407,'El Mantaro',1204),"+
                "(120408,'Huamali',1204),"+
                "(120409,'Huaripampa',1204),"+
                "(120410,'Huertas',1204),"+
                "(120411,'Janjaillo',1204),"+
                "(120412,'JulcÃ¡n',1204),"+
                "(120413,'Leonor OrdÃ³Ã±ez',1204),"+
                "(120414,'Llocllapampa',1204),"+
                "(120415,'Marco',1204),"+
                "(120416,'Masma',1204),"+
                "(120417,'Masma Chicche',1204),"+
                "(120418,'Molinos',1204),"+
                "(120419,'Monobamba',1204),"+
                "(120420,'Muqui',1204),"+
                "(120421,'Muquiyauyo',1204),"+
                "(120422,'Paca',1204),"+
                "(120423,'Paccha',1204),"+
                "(120424,'Pancan',1204),"+
                "(120425,'Parco',1204),"+
                "(120426,'Pomacancha',1204),"+
                "(120427,'Ricran',1204),"+
                "(120428,'San Lorenzo',1204),"+
                "(120429,'San Pedro de Chunan',1204),"+
                "(120430,'Sausa',1204),"+
                "(120431,'Sincos',1204),"+
                "(120432,'Tunan Marca',1204),"+
                "(120433,'Yauli',1204),"+
                "(120434,'Yauyos',1204),"+
                "(120501,'Junin',1205),"+
                "(120502,'Carhuamayo',1205),"+
                "(120503,'Ondores',1205),"+
                "(120504,'Ulcumayo',1205),"+
                "(120601,'Satipo',1206),"+
                "(120602,'Coviriali',1206),"+
                "(120603,'Llaylla',1206),"+
                "(120604,'Mazamari',1206),"+
                "(120605,'Pampa Hermosa',1206),"+
                "(120606,'Pangoa',1206),"+
                "(120607,'RÃ­o Negro',1206),"+
                "(120608,'RÃ­o Tambo',1206),"+
                "(120609,'Vizcatan del Ene',1206),"+
                "(120701,'Tarma',1207),"+
                "(120702,'Acobamba',1207),"+
                "(120703,'Huaricolca',1207),"+
                "(120704,'Huasahuasi',1207),"+
                "(120705,'La UniÃ³n',1207),"+
                "(120706,'Palca',1207),"+
                "(120707,'Palcamayo',1207),"+
                "(120708,'San Pedro de Cajas',1207),"+
                "(120709,'Tapo',1207),"+
                "(120801,'La Oroya',1208),"+
                "(120802,'Chacapalpa',1208),"+
                "(120803,'Huay-Huay',1208),"+
                "(120804,'Marcapomacocha',1208),"+
                "(120805,'Morococha',1208),"+
                "(120806,'Paccha',1208),"+
                "(120807,'Santa BÃ¡rbara de Carhuacayan',1208),"+
                "(120808,'Santa Rosa de Sacco',1208),"+
                "(120809,'Suitucancha',1208),"+
                "(120810,'Yauli',1208),"+
                "(120901,'Chupaca',1209),"+
                "(120902,'Ahuac',1209),"+
                "(120903,'Chongos Bajo',1209),"+
                "(120904,'Huachac',1209),"+
                "(120905,'Huamancaca Chico',1209),"+
                "(120906,'San Juan de Iscos',1209),"+
                "(120907,'San Juan de Jarpa',1209),"+
                "(120908,'Tres de Diciembre',1209),"+
                "(120909,'Yanacancha',1209),"+
                "(130101,'Trujillo',1301),"+
                "(130102,'El Porvenir',1301),"+
                "(130103,'Florencia de Mora',1301),"+
                "(130104,'Huanchaco',1301),"+
                "(130105,'La Esperanza',1301),"+
                "(130106,'Laredo',1301),"+
                "(130107,'Moche',1301),"+
                "(130108,'Poroto',1301),"+
                "(130109,'Salaverry',1301),"+
                "(130110,'Simbal',1301),"+
                "(130111,'Victor Larco Herrera',1301),"+
                "(130201,'Ascope',1302),"+
                "(130202,'Chicama',1302),"+
                "(130203,'Chocope',1302),"+
                "(130204,'Magdalena de Cao',1302),"+
                "(130205,'Paijan',1302),"+
                "(130206,'RÃ¡zuri',1302),"+
                "(130207,'Santiago de Cao',1302),"+
                "(130208,'Casa Grande',1302),"+
                "(130301,'BolÃ­var',1303),"+
                "(130302,'Bambamarca',1303),"+
                "(130303,'Condormarca',1303),"+
                "(130304,'Longotea',1303),"+
                "(130305,'Uchumarca',1303),"+
                "(130306,'Ucuncha',1303),"+
                "(130401,'Chepen',1304),"+
                "(130402,'Pacanga',1304),"+
                "(130403,'Pueblo Nuevo',1304),"+
                "(130501,'Julcan',1305),"+
                "(130502,'Calamarca',1305),"+
                "(130503,'Carabamba',1305),"+
                "(130504,'Huaso',1305),"+
                "(130601,'Otuzco',1306),"+
                "(130602,'Agallpampa',1306),"+
                "(130604,'Charat',1306),"+
                "(130605,'Huaranchal',1306),"+
                "(130606,'La Cuesta',1306),"+
                "(130608,'Mache',1306),"+
                "(130610,'Paranday',1306),"+
                "(130611,'Salpo',1306),"+
                "(130613,'Sinsicap',1306),"+
                "(130614,'Usquil',1306),"+
                "(130701,'San Pedro de Lloc',1307),"+
                "(130702,'Guadalupe',1307),"+
                "(130703,'Jequetepeque',1307),"+
                "(130704,'Pacasmayo',1307),"+
                "(130705,'San JosÃ©',1307),"+
                "(130801,'Tayabamba',1308),"+
                "(130802,'Buldibuyo',1308),"+
                "(130803,'Chillia',1308),"+
                "(130804,'Huancaspata',1308),"+
                "(130805,'Huaylillas',1308),"+
                "(130806,'Huayo',1308),"+
                "(130807,'Ongon',1308),"+
                "(130808,'Parcoy',1308),"+
                "(130809,'Pataz',1308),"+
                "(130810,'Pias',1308),"+
                "(130811,'Santiago de Challas',1308),"+
                "(130812,'Taurija',1308),"+
                "(130813,'Urpay',1308),"+
                "(130901,'Huamachuco',1309),"+
                "(130902,'Chugay',1309),"+
                "(130903,'Cochorco',1309),"+
                "(130904,'Curgos',1309),"+
                "(130905,'Marcabal',1309),"+
                "(130906,'Sanagoran',1309),"+
                "(130907,'Sarin',1309),"+
                "(130908,'Sartimbamba',1309),"+
                "(131001,'Santiago de Chuco',1310),"+
                "(131002,'Angasmarca',1310),"+
                "(131003,'Cachicadan',1310),"+
                "(131004,'Mollebamba',1310),"+
                "(131005,'Mollepata',1310),"+
                "(131006,'Quiruvilca',1310),"+
                "(131007,'Santa Cruz de Chuca',1310),"+
                "(131008,'Sitabamba',1310),"+
                "(131101,'Cascas',1311),"+
                "(131102,'Lucma',1311),"+
                "(131103,'Marmot',1311),"+
                "(131104,'Sayapullo',1311),"+
                "(131201,'Viru',1312),"+
                "(131202,'Chao',1312),"+
                "(131203,'Guadalupito',1312),"+
                "(140101,'Chiclayo',1401),"+
                "(140102,'Chongoyape',1401),"+
                "(140103,'Eten',1401),"+
                "(140104,'Eten Puerto',1401),"+
                "(140105,'JosÃ© Leonardo Ortiz',1401),"+
                "(140106,'La Victoria',1401),"+
                "(140107,'Lagunas',1401),"+
                "(140108,'Monsefu',1401),"+
                "(140109,'Nueva Arica',1401),"+
                "(140110,'Oyotun',1401),"+
                "(140111,'Picsi',1401),"+
                "(140112,'Pimentel',1401),"+
                "(140113,'Reque',1401),"+
                "(140114,'Santa Rosa',1401),"+
                "(140115,'SaÃ±a',1401),"+
                "(140116,'Cayalti',1401),"+
                "(140117,'Patapo',1401),"+
                "(140118,'Pomalca',1401),"+
                "(140119,'Pucala',1401),"+
                "(140120,'Tuman',1401),"+
                "(140201,'FerreÃ±afe',1402),"+
                "(140202,'CaÃ±aris',1402),"+
                "(140203,'Incahuasi',1402),"+
                "(140204,'Manuel Antonio Mesones Muro',1402),"+
                "(140205,'Pitipo',1402),"+
                "(140206,'Pueblo Nuevo',1402),"+
                "(140301,'Lambayeque',1403),"+
                "(140302,'Chochope',1403),"+
                "(140303,'Illimo',1403),"+
                "(140304,'Jayanca',1403),"+
                "(140305,'Mochumi',1403),"+
                "(140306,'Morrope',1403),"+
                "(140307,'Motupe',1403),"+
                "(140308,'Olmos',1403),"+
                "(140309,'Pacora',1403),"+
                "(140310,'Salas',1403),"+
                "(140311,'San JosÃ©',1403),"+
                "(140312,'Tucume',1403),"+
                "(150101,'Lima',1501),"+
                "(150102,'AncÃ³n',1501),"+
                "(150103,'Ate',1501),"+
                "(150104,'Barranco',1501),"+
                "(150105,'BreÃ±a',1501),"+
                "(150106,'Carabayllo',1501),"+
                "(150107,'Chaclacayo',1501),"+
                "(150108,'Chorrillos',1501),"+
                "(150109,'Cieneguilla',1501),"+
                "(150110,'Comas',1501),"+
                "(150111,'El Agustino',1501),"+
                "(150112,'Independencia',1501),"+
                "(150113,'JesÃºs MarÃ­a',1501),"+
                "(150114,'La Molina',1501),"+
                "(150115,'La Victoria',1501),"+
                "(150116,'Lince',1501),"+
                "(150117,'Los Olivos',1501),"+
                "(150118,'Lurigancho',1501),"+
                "(150119,'Lurin',1501),"+
                "(150120,'Magdalena del Mar',1501),"+
                "(150121,'Pueblo Libre',1501),"+
                "(150122,'Miraflores',1501),"+
                "(150123,'Pachacamac',1501),"+
                "(150124,'Pucusana',1501),"+
                "(150125,'Puente Piedra',1501),"+
                "(150126,'Punta Hermosa',1501),"+
                "(150127,'Punta Negra',1501),"+
                "(150128,'RÃ­mac',1501),"+
                "(150129,'San Bartolo',1501),"+
                "(150130,'San Borja',1501),"+
                "(150131,'San Isidro',1501),"+
                "(150132,'San Juan de Lurigancho',1501),"+
                "(150133,'San Juan de Miraflores',1501),"+
                "(150134,'San Luis',1501),"+
                "(150135,'San MartÃ­n de Porres',1501),"+
                "(150136,'San Miguel',1501),"+
                "(150137,'Santa Anita',1501),"+
                "(150138,'Santa MarÃ­a del Mar',1501),"+
                "(150139,'Santa Rosa',1501),"+
                "(150140,'Santiago de Surco',1501),"+
                "(150141,'Surquillo',1501),"+
                "(150142,'Villa El Salvador',1501),"+
                "(150143,'Villa MarÃ­a del Triunfo',1501),"+
                "(150201,'Barranca',1502),"+
                "(150202,'Paramonga',1502),"+
                "(150203,'Pativilca',1502),"+
                "(150204,'Supe',1502),"+
                "(150205,'Supe Puerto',1502),"+
                "(150301,'Cajatambo',1503),"+
                "(150302,'Copa',1503),"+
                "(150303,'Gorgor',1503),"+
                "(150304,'Huancapon',1503),"+
                "(150305,'Manas',1503),"+
                "(150401,'Canta',1504),"+
                "(150402,'Arahuay',1504),"+
                "(150403,'Huamantanga',1504),"+
                "(150404,'Huaros',1504),"+
                "(150405,'Lachaqui',1504),"+
                "(150406,'San Buenaventura',1504),"+
                "(150407,'Santa Rosa de Quives',1504),"+
                "(150501,'San Vicente de CaÃ±ete',1505),"+
                "(150502,'Asia',1505),"+
                "(150503,'Calango',1505),"+
                "(150504,'Cerro Azul',1505),"+
                "(150505,'Chilca',1505),"+
                "(150506,'Coayllo',1505),"+
                "(150507,'Imperial',1505),"+
                "(150508,'Lunahuana',1505),"+
                "(150509,'Mala',1505),"+
                "(150510,'Nuevo Imperial',1505),"+
                "(150511,'Pacaran',1505),"+
                "(150512,'Quilmana',1505),"+
                "(150513,'San Antonio',1505),"+
                "(150514,'San Luis',1505),"+
                "(150515,'Santa Cruz de Flores',1505),"+
                "(150516,'ZÃºÃ±iga',1505),"+
                "(150601,'Huaral',1506),"+
                "(150602,'Atavillos Alto',1506),"+
                "(150603,'Atavillos Bajo',1506),"+
                "(150604,'Aucallama',1506),"+
                "(150605,'Chancay',1506),"+
                "(150606,'Ihuari',1506),"+
                "(150607,'Lampian',1506),"+
                "(150608,'Pacaraos',1506),"+
                "(150609,'San Miguel de Acos',1506),"+
                "(150610,'Santa Cruz de Andamarca',1506),"+
                "(150611,'Sumbilca',1506),"+
                "(150612,'Veintisiete de Noviembre',1506),"+
                "(150701,'Matucana',1507),"+
                "(150702,'Antioquia',1507),"+
                "(150703,'Callahuanca',1507),"+
                "(150704,'Carampoma',1507),"+
                "(150705,'Chicla',1507),"+
                "(150706,'Cuenca',1507),"+
                "(150707,'Huachupampa',1507),"+
                "(150708,'Huanza',1507),"+
                "(150709,'Huarochiri',1507),"+
                "(150710,'Lahuaytambo',1507),"+
                "(150711,'Langa',1507),"+
                "(150712,'Laraos',1507),"+
                "(150713,'Mariatana',1507),"+
                "(150714,'Ricardo Palma',1507),"+
                "(150715,'San AndrÃ©s de Tupicocha',1507),"+
                "(150716,'San Antonio',1507),"+
                "(150717,'San BartolomÃ©',1507),"+
                "(150718,'San Damian',1507),"+
                "(150719,'San Juan de Iris',1507),"+
                "(150720,'San Juan de Tantaranche',1507),"+
                "(150721,'San Lorenzo de Quinti',1507),"+
                "(150722,'San Mateo',1507),"+
                "(150723,'San Mateo de Otao',1507),"+
                "(150724,'San Pedro de Casta',1507),"+
                "(150725,'San Pedro de Huancayre',1507),"+
                "(150726,'Sangallaya',1507),"+
                "(150727,'Santa Cruz de Cocachacra',1507),"+
                "(150728,'Santa Eulalia',1507),"+
                "(150729,'Santiago de Anchucaya',1507),"+
                "(150730,'Santiago de Tuna',1507),"+
                "(150731,'Santo Domingo de Los Olleros',1507),"+
                "(150732,'Surco',1507),"+
                "(150801,'Huacho',1508),"+
                "(150802,'Ambar',1508),"+
                "(150803,'Caleta de Carquin',1508),"+
                "(150804,'Checras',1508),"+
                "(150805,'Hualmay',1508),"+
                "(150806,'Huaura',1508),"+
                "(150807,'Leoncio Prado',1508),"+
                "(150808,'Paccho',1508),"+
                "(150809,'Santa Leonor',1508),"+
                "(150810,'Santa MarÃ­a',1508),"+
                "(150811,'Sayan',1508),"+
                "(150812,'Vegueta',1508),"+
                "(150901,'Oyon',1509),"+
                "(150902,'Andajes',1509),"+
                "(150903,'Caujul',1509),"+
                "(150904,'Cochamarca',1509),"+
                "(150905,'Navan',1509),"+
                "(150906,'Pachangara',1509),"+
                "(151001,'Yauyos',1510),"+
                "(151002,'Alis',1510),"+
                "(151003,'Allauca',1510),"+
                "(151004,'Ayaviri',1510),"+
                "(151005,'AzÃ¡ngaro',1510),"+
                "(151006,'Cacra',1510),"+
                "(151007,'Carania',1510),"+
                "(151008,'Catahuasi',1510),"+
                "(151009,'Chocos',1510),"+
                "(151010,'Cochas',1510),"+
                "(151011,'Colonia',1510),"+
                "(151012,'Hongos',1510),"+
                "(151013,'Huampara',1510),"+
                "(151014,'Huancaya',1510),"+
                "(151015,'Huangascar',1510),"+
                "(151016,'Huantan',1510),"+
                "(151017,'HuaÃ±ec',1510),"+
                "(151018,'Laraos',1510),"+
                "(151019,'Lincha',1510),"+
                "(151020,'Madean',1510),"+
                "(151021,'Miraflores',1510),"+
                "(151022,'Omas',1510),"+
                "(151023,'Putinza',1510),"+
                "(151024,'Quinches',1510),"+
                "(151025,'Quinocay',1510),"+
                "(151026,'San JoaquÃ­n',1510),"+
                "(151027,'San Pedro de Pilas',1510),"+
                "(151028,'Tanta',1510),"+
                "(151029,'Tauripampa',1510),"+
                "(151030,'Tomas',1510),"+
                "(151031,'Tupe',1510),"+
                "(151032,'ViÃ±ac',1510),"+
                "(151033,'Vitis',1510),"+
                "(160101,'Iquitos',1601),"+
                "(160102,'Alto Nanay',1601),"+
                "(160103,'Fernando Lores',1601),"+
                "(160104,'Indiana',1601),"+
                "(160105,'Las Amazonas',1601),"+
                "(160106,'Mazan',1601),"+
                "(160107,'Napo',1601),"+
                "(160108,'Punchana',1601),"+
                "(160110,'Torres Causana',1601),"+
                "(160112,'BelÃ©n',1601),"+
                "(160113,'San Juan Bautista',1601),"+
                "(160201,'Yurimaguas',1602),"+
                "(160202,'Balsapuerto',1602),"+
                "(160205,'Jeberos',1602),"+
                "(160206,'Lagunas',1602),"+
                "(160210,'Santa Cruz',1602),"+
                "(160211,'Teniente Cesar LÃ³pez Rojas',1602),"+
                "(160301,'Nauta',1603),"+
                "(160302,'Parinari',1603),"+
                "(160303,'Tigre',1603),"+
                "(160304,'Trompeteros',1603),"+
                "(160305,'Urarinas',1603),"+
                "(160401,'RamÃ³n Castilla',1604),"+
                "(160402,'Pebas',1604),"+
                "(160403,'Yavari',1604),"+
                "(160404,'San Pablo',1604),"+
                "(160501,'Requena',1605),"+
                "(160502,'Alto Tapiche',1605),"+
                "(160503,'Capelo',1605),"+
                "(160504,'Emilio San MartÃ­n',1605),"+
                "(160505,'Maquia',1605),"+
                "(160506,'Puinahua',1605),"+
                "(160507,'Saquena',1605),"+
                "(160508,'Soplin',1605),"+
                "(160509,'Tapiche',1605),"+
                "(160510,'Jenaro Herrera',1605),"+
                "(160511,'Yaquerana',1605),"+
                "(160601,'Contamana',1606),"+
                "(160602,'Inahuaya',1606),"+
                "(160603,'Padre MÃ¡rquez',1606),"+
                "(160604,'Pampa Hermosa',1606),"+
                "(160605,'Sarayacu',1606),"+
                "(160606,'Vargas Guerra',1606),"+
                "(160701,'Barranca',1607),"+
                "(160702,'Cahuapanas',1607),"+
                "(160703,'Manseriche',1607),"+
                "(160704,'Morona',1607),"+
                "(160705,'Pastaza',1607),"+
                "(160706,'Andoas',1607),"+
                "(160801,'Putumayo',1608),"+
                "(160802,'Rosa Panduro',1608),"+
                "(160803,'Teniente Manuel Clavero',1608),"+
                "(160804,'Yaguas',1608),"+
                "(170101,'Tambopata',1701),"+
                "(170102,'Inambari',1701),"+
                "(170103,'Las Piedras',1701),"+
                "(170104,'Laberinto',1701),"+
                "(170201,'Manu',1702),"+
                "(170202,'Fitzcarrald',1702),"+
                "(170203,'Madre de Dios',1702),"+
                "(170204,'Huepetuhe',1702),"+
                "(170301,'IÃ±apari',1703),"+
                "(170302,'Iberia',1703),"+
                "(170303,'Tahuamanu',1703),"+
                "(180101,'Moquegua',1801),"+
                "(180102,'Carumas',1801),"+
                "(180103,'Cuchumbaya',1801),"+
                "(180104,'Samegua',1801),"+
                "(180105,'San CristÃ³bal',1801),"+
                "(180106,'Torata',1801),"+
                "(180201,'Omate',1802),"+
                "(180202,'Chojata',1802),"+
                "(180203,'Coalaque',1802),"+
                "(180204,'IchuÃ±a',1802),"+
                "(180205,'La Capilla',1802),"+
                "(180206,'Lloque',1802),"+
                "(180207,'Matalaque',1802),"+
                "(180208,'Puquina',1802),"+
                "(180209,'Quinistaquillas',1802),"+
                "(180210,'Ubinas',1802),"+
                "(180211,'Yunga',1802),"+
                "(180301,'Ilo',1803),"+
                "(180302,'El Algarrobal',1803),"+
                "(180303,'Pacocha',1803),"+
                "(190101,'Chaupimarca',1901),"+
                "(190102,'Huachon',1901),"+
                "(190103,'Huariaca',1901),"+
                "(190104,'Huayllay',1901),"+
                "(190105,'Ninacaca',1901),"+
                "(190106,'Pallanchacra',1901),"+
                "(190107,'Paucartambo',1901),"+
                "(190108,'San Francisco de AsÃ­s de Yarusyacan',1901),"+
                "(190109,'Simon BolÃ­var',1901),"+
                "(190110,'Ticlacayan',1901),"+
                "(190111,'Tinyahuarco',1901),"+
                "(190112,'Vicco',1901),"+
                "(190113,'Yanacancha',1901),"+
                "(190201,'Yanahuanca',1902),"+
                "(190202,'Chacayan',1902),"+
                "(190203,'Goyllarisquizga',1902),"+
                "(190204,'Paucar',1902),"+
                "(190205,'San Pedro de Pillao',1902),"+
                "(190206,'Santa Ana de Tusi',1902),"+
                "(190207,'Tapuc',1902),"+
                "(190208,'Vilcabamba',1902),"+
                "(190301,'Oxapampa',1903),"+
                "(190302,'Chontabamba',1903),"+
                "(190303,'Huancabamba',1903),"+
                "(190304,'Palcazu',1903),"+
                "(190305,'Pozuzo',1903),"+
                "(190306,'Puerto BermÃºdez',1903),"+
                "(190307,'Villa Rica',1903),"+
                "(190308,'ConstituciÃ³n',1903),"+
                "(200101,'Piura',2001),"+
                "(200104,'Castilla',2001),"+
                "(200105,'Catacaos',2001),"+
                "(200107,'Cura Mori',2001),"+
                "(200108,'El Tallan',2001),"+
                "(200109,'La Arena',2001),"+
                "(200110,'La UniÃ³n',2001),"+
                "(200111,'Las Lomas',2001),"+
                "(200114,'Tambo Grande',2001),"+
                "(200115,'Veintiseis de Octubre',2001),"+
                "(200201,'Ayabaca',2002),"+
                "(200202,'Frias',2002),"+
                "(200203,'Jilili',2002),"+
                "(200204,'Lagunas',2002),"+
                "(200205,'Montero',2002),"+
                "(200206,'Pacaipampa',2002),"+
                "(200207,'Paimas',2002),"+
                "(200208,'Sapillica',2002),"+
                "(200209,'Sicchez',2002),"+
                "(200210,'Suyo',2002),"+
                "(200301,'Huancabamba',2003),"+
                "(200302,'Canchaque',2003),"+
                "(200303,'El Carmen de la Frontera',2003),"+
                "(200304,'Huarmaca',2003),"+
                "(200305,'Lalaquiz',2003),"+
                "(200306,'San Miguel de El Faique',2003),"+
                "(200307,'Sondor',2003),"+
                "(200308,'Sondorillo',2003),"+
                "(200401,'Chulucanas',2004),"+
                "(200402,'Buenos Aires',2004),"+
                "(200403,'Chalaco',2004),"+
                "(200404,'La Matanza',2004),"+
                "(200405,'Morropon',2004),"+
                "(200406,'Salitral',2004),"+
                "(200407,'San Juan de Bigote',2004),"+
                "(200408,'Santa Catalina de Mossa',2004),"+
                "(200409,'Santo Domingo',2004),"+
                "(200410,'Yamango',2004),"+
                "(200501,'Paita',2005),"+
                "(200502,'Amotape',2005),"+
                "(200503,'Arenal',2005),"+
                "(200504,'Colan',2005),"+
                "(200505,'La Huaca',2005),"+
                "(200506,'Tamarindo',2005),"+
                "(200507,'Vichayal',2005),"+
                "(200601,'Sullana',2006),"+
                "(200602,'Bellavista',2006),"+
                "(200603,'Ignacio Escudero',2006),"+
                "(200604,'Lancones',2006),"+
                "(200605,'Marcavelica',2006),"+
                "(200606,'Miguel Checa',2006),"+
                "(200607,'Querecotillo',2006),"+
                "(200608,'Salitral',2006),"+
                "(200701,'PariÃ±as',2007),"+
                "(200702,'El Alto',2007),"+
                "(200703,'La Brea',2007),"+
                "(200704,'Lobitos',2007),"+
                "(200705,'Los Organos',2007),"+
                "(200706,'Mancora',2007),"+
                "(200801,'Sechura',2008),"+
                "(200802,'Bellavista de la UniÃ³n',2008),"+
                "(200803,'Bernal',2008),"+
                "(200804,'Cristo Nos Valga',2008),"+
                "(200805,'Vice',2008),"+
                "(200806,'Rinconada Llicuar',2008),"+
                "(210101,'Puno',2101),"+
                "(210102,'Acora',2101),"+
                "(210103,'Amantani',2101),"+
                "(210104,'Atuncolla',2101),"+
                "(210105,'Capachica',2101),"+
                "(210106,'Chucuito',2101),"+
                "(210107,'Coata',2101),"+
                "(210108,'Huata',2101),"+
                "(210109,'MaÃ±azo',2101),"+
                "(210110,'Paucarcolla',2101),"+
                "(210111,'Pichacani',2101),"+
                "(210112,'Plateria',2101),"+
                "(210113,'San Antonio',2101),"+
                "(210114,'Tiquillaca',2101),"+
                "(210115,'Vilque',2101),"+
                "(210201,'AzÃ¡ngaro',2102),"+
                "(210202,'Achaya',2102),"+
                "(210203,'Arapa',2102),"+
                "(210204,'Asillo',2102),"+
                "(210205,'Caminaca',2102),"+
                "(210206,'Chupa',2102),"+
                "(210207,'JosÃ© Domingo Choquehuanca',2102),"+
                "(210208,'MuÃ±ani',2102),"+
                "(210209,'Potoni',2102),"+
                "(210210,'Saman',2102),"+
                "(210211,'San Anton',2102),"+
                "(210212,'San JosÃ©',2102),"+
                "(210213,'San Juan de Salinas',2102),"+
                "(210214,'Santiago de Pupuja',2102),"+
                "(210215,'Tirapata',2102),"+
                "(210301,'Macusani',2103),"+
                "(210302,'Ajoyani',2103),"+
                "(210303,'Ayapata',2103),"+
                "(210304,'Coasa',2103),"+
                "(210305,'Corani',2103),"+
                "(210306,'Crucero',2103),"+
                "(210307,'Ituata',2103),"+
                "(210308,'Ollachea',2103),"+
                "(210309,'San Gaban',2103),"+
                "(210310,'Usicayos',2103),"+
                "(210401,'Juli',2104),"+
                "(210402,'Desaguadero',2104),"+
                "(210403,'Huacullani',2104),"+
                "(210404,'Kelluyo',2104),"+
                "(210405,'Pisacoma',2104),"+
                "(210406,'Pomata',2104),"+
                "(210407,'Zepita',2104),"+
                "(210501,'Ilave',2105),"+
                "(210502,'Capazo',2105),"+
                "(210503,'Pilcuyo',2105),"+
                "(210504,'Santa Rosa',2105),"+
                "(210505,'Conduriri',2105),"+
                "(210601,'Huancane',2106),"+
                "(210602,'Cojata',2106),"+
                "(210603,'Huatasani',2106),"+
                "(210604,'Inchupalla',2106),"+
                "(210605,'Pusi',2106),"+
                "(210606,'Rosaspata',2106),"+
                "(210607,'Taraco',2106),"+
                "(210608,'Vilque Chico',2106),"+
                "(210701,'Lampa',2107),"+
                "(210702,'Cabanilla',2107),"+
                "(210703,'Calapuja',2107),"+
                "(210704,'Nicasio',2107),"+
                "(210705,'Ocuviri',2107),"+
                "(210706,'Palca',2107),"+
                "(210707,'Paratia',2107),"+
                "(210708,'Pucara',2107),"+
                "(210709,'Santa Lucia',2107),"+
                "(210710,'Vilavila',2107),"+
                "(210801,'Ayaviri',2108),"+
                "(210802,'Antauta',2108),"+
                "(210803,'Cupi',2108),"+
                "(210804,'Llalli',2108),"+
                "(210805,'Macari',2108),"+
                "(210806,'NuÃ±oa',2108),"+
                "(210807,'Orurillo',2108),"+
                "(210808,'Santa Rosa',2108),"+
                "(210809,'Umachiri',2108),"+
                "(210901,'Moho',2109),"+
                "(210902,'Conima',2109),"+
                "(210903,'Huayrapata',2109),"+
                "(210904,'Tilali',2109),"+
                "(211001,'Putina',2110),"+
                "(211002,'Ananea',2110),"+
                "(211003,'Pedro Vilca Apaza',2110),"+
                "(211004,'Quilcapuncu',2110),"+
                "(211005,'Sina',2110),"+
                "(211101,'Juliaca',2111),"+
                "(211102,'Cabana',2111),"+
                "(211103,'Cabanillas',2111),"+
                "(211104,'Caracoto',2111),"+
                "(211105,'San Miguel',2111),"+
                "(211201,'Sandia',2112),"+
                "(211202,'Cuyocuyo',2112),"+
                "(211203,'Limbani',2112),"+
                "(211204,'Patambuco',2112),"+
                "(211205,'Phara',2112),"+
                "(211206,'Quiaca',2112),"+
                "(211207,'San Juan del Oro',2112),"+
                "(211208,'Yanahuaya',2112),"+
                "(211209,'Alto Inambari',2112),"+
                "(211210,'San Pedro de Putina Punco',2112),"+
                "(211301,'Yunguyo',2113),"+
                "(211302,'Anapia',2113),"+
                "(211303,'Copani',2113),"+
                "(211304,'Cuturapi',2113),"+
                "(211305,'Ollaraya',2113),"+
                "(211306,'Tinicachi',2113),"+
                "(211307,'Unicachi',2113),"+
                "(220101,'Moyobamba',2201),"+
                "(220102,'Calzada',2201),"+
                "(220103,'Habana',2201),"+
                "(220104,'Jepelacio',2201),"+
                "(220105,'Soritor',2201),"+
                "(220106,'Yantalo',2201),"+
                "(220201,'Bellavista',2202),"+
                "(220202,'Alto Biavo',2202),"+
                "(220203,'Bajo Biavo',2202),"+
                "(220204,'Huallaga',2202),"+
                "(220205,'San Pablo',2202),"+
                "(220206,'San Rafael',2202),"+
                "(220301,'San JosÃ© de Sisa',2203),"+
                "(220302,'Agua Blanca',2203),"+
                "(220303,'San MartÃ­n',2203),"+
                "(220304,'Santa Rosa',2203),"+
                "(220305,'Shatoja',2203),"+
                "(220401,'Saposoa',2204),"+
                "(220402,'Alto Saposoa',2204),"+
                "(220403,'El EslabÃ³n',2204),"+
                "(220404,'Piscoyacu',2204),"+
                "(220405,'Sacanche',2204),"+
                "(220406,'Tingo de Saposoa',2204),"+
                "(220501,'Lamas',2205),"+
                "(220502,'Alonso de Alvarado',2205),"+
                "(220503,'Barranquita',2205),"+
                "(220504,'Caynarachi',2205),"+
                "(220505,'CuÃ±umbuqui',2205),"+
                "(220506,'Pinto Recodo',2205),"+
                "(220507,'Rumisapa',2205),"+
                "(220508,'San Roque de Cumbaza',2205),"+
                "(220509,'Shanao',2205),"+
                "(220510,'Tabalosos',2205),"+
                "(220511,'Zapatero',2205),"+
                "(220601,'JuanjuÃ­',2206),"+
                "(220602,'Campanilla',2206),"+
                "(220603,'Huicungo',2206),"+
                "(220604,'Pachiza',2206),"+
                "(220605,'Pajarillo',2206),"+
                "(220701,'Picota',2207),"+
                "(220702,'Buenos Aires',2207),"+
                "(220703,'Caspisapa',2207),"+
                "(220704,'Pilluana',2207),"+
                "(220705,'Pucacaca',2207),"+
                "(220706,'San CristÃ³bal',2207),"+
                "(220707,'San HilariÃ³n',2207),"+
                "(220708,'Shamboyacu',2207),"+
                "(220709,'Tingo de Ponasa',2207),"+
                "(220710,'Tres Unidos',2207),"+
                "(220801,'Rioja',2208),"+
                "(220802,'Awajun',2208),"+
                "(220803,'ElÃ­as Soplin Vargas',2208),"+
                "(220804,'Nueva Cajamarca',2208),"+
                "(220805,'Pardo Miguel',2208),"+
                "(220806,'Posic',2208),"+
                "(220807,'San Fernando',2208),"+
                "(220808,'Yorongos',2208),"+
                "(220809,'Yuracyacu',2208),"+
                "(220901,'Tarapoto',2209),"+
                "(220902,'Alberto Leveau',2209),"+
                "(220903,'Cacatachi',2209),"+
                "(220904,'Chazuta',2209),"+
                "(220905,'Chipurana',2209),"+
                "(220906,'El Porvenir',2209),"+
                "(220907,'Huimbayoc',2209),"+
                "(220908,'Juan Guerra',2209),"+
                "(220909,'La Banda de Shilcayo',2209),"+
                "(220910,'Morales',2209),"+
                "(220911,'Papaplaya',2209),"+
                "(220912,'San Antonio',2209),"+
                "(220913,'Sauce',2209),"+
                "(220914,'Shapaja',2209),"+
                "(221001,'Tocache',2210),"+
                "(221002,'Nuevo Progreso',2210),"+
                "(221003,'Polvora',2210),"+
                "(221004,'Shunte',2210),"+
                "(221005,'Uchiza',2210),"+
                "(230101,'Tacna',2301),"+
                "(230102,'Alto de la Alianza',2301),"+
                "(230103,'Calana',2301),"+
                "(230104,'Ciudad Nueva',2301),"+
                "(230105,'Inclan',2301),"+
                "(230106,'Pachia',2301),"+
                "(230107,'Palca',2301),"+
                "(230108,'Pocollay',2301),"+
                "(230109,'Sama',2301),"+
                "(230110,'Coronel Gregorio AlbarracÃ­n Lanchipa',2301),"+
                "(230111,'La Yarada los Palos',2301),"+
                "(230201,'Candarave',2302),"+
                "(230202,'Cairani',2302),"+
                "(230203,'Camilaca',2302),"+
                "(230204,'Curibaya',2302),"+
                "(230205,'Huanuara',2302),"+
                "(230206,'Quilahuani',2302),"+
                "(230301,'Locumba',2303),"+
                "(230302,'Ilabaya',2303),"+
                "(230303,'Ite',2303),"+
                "(230401,'Tarata',2304),"+
                "(230402,'HÃ©roes AlbarracÃ­n',2304),"+
                "(230403,'Estique',2304),"+
                "(230404,'Estique-Pampa',2304),"+
                "(230405,'Sitajara',2304),"+
                "(230406,'Susapaya',2304),"+
                "(230407,'Tarucachi',2304),"+
                "(230408,'Ticaco',2304),"+
                "(240101,'Tumbes',2401),"+
                "(240102,'Corrales',2401),"+
                "(240103,'La Cruz',2401),"+
                "(240104,'Pampas de Hospital',2401),"+
                "(240105,'San Jacinto',2401),"+
                "(240106,'San Juan de la Virgen',2401),"+
                "(240201,'Zorritos',2402),"+
                "(240202,'Casitas',2402),"+
                "(240203,'Canoas de Punta Sal',2402),"+
                "(240301,'Zarumilla',2403),"+
                "(240302,'Aguas Verdes',2403),"+
                "(240303,'Matapalo',2403),"+
                "(240304,'Papayal',2403),"+
                "(250101,'Calleria',2501),"+
                "(250102,'Campoverde',2501),"+
                "(250103,'Iparia',2501),"+
                "(250104,'Masisea',2501),"+
                "(250105,'Yarinacocha',2501),"+
                "(250106,'Nueva Requena',2501),"+
                "(250107,'Manantay',2501),"+
                "(250201,'Raymondi',2502),"+
                "(250202,'Sepahua',2502),"+
                "(250203,'Tahuania',2502),"+
                "(250204,'Yurua',2502),"+
                "(250301,'Padre Abad',2503),"+
                "(250302,'Irazola',2503),"+
                "(250303,'Curimana',2503),"+
                "(250304,'Neshuya',2503),"+
                "(250305,'Alexander Von Humboldt',2503),"+
                "(250401,'Purus',2504)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_DISTRITOS);
        onCreate(sqLiteDatabase);
    }
}
