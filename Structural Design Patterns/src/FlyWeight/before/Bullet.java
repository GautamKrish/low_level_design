public class Bullet{
	double length;                      //8 bytes
	double width;                       //8 bytes
	double height;                      //8 bytes
	double weight;                      //8 bytes
	double calibre;                     //8 bytes
	double damage;                      //8 bytes
	byte[] image;                       //2 kb
	double current_speed;               //8 bytes
	double current_latitude;            //8 bytes
	double current_longitude;           //8 bytes
	long shotByUsedId;                  //8 bytes
	int direction;                      //4 bytes
}

// total size of a bullet =>  2084 bytes