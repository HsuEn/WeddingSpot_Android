package xixi.weddingspot;


import android.util.Log;


public class WLog {
	private static boolean isLog = true;
	
	public static void e ( String TAG, String msg) {
		if ( isLog ) {
			Log.e(TAG, msg);
		}
	}
	
	public static void w ( String TAG, String msg) {
		if ( isLog ) {
			Log.w(TAG, msg);
		}
	}
	
	public static void i ( String TAG, String msg) {
		if ( isLog ) {
			Log.i(TAG, msg);
		}
	}
	
	public static void v ( String TAG, String msg) {
		if ( isLog ) {
			Log.v(TAG, msg);
		}
	}
	
	public static void d(String TAG, String msg) {
		if ( isLog ) {
			Log.d(TAG, msg);
		}
	}
	
	public static void println ( int priority, String TAG, String msg) {
		
		if ( isLog ) {
			switch (priority) {
			case 0:
				e( TAG, msg);
				break;
			case 1:
				w( TAG, msg);
				break;
			case 2:
				i( TAG, msg);
				break;
			default:
				v( TAG, msg);		
			}
			
		}
			
		
	}
	
}
