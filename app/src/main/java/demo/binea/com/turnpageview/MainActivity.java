package demo.binea.com.turnpageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import demo.binea.com.turnpageview.widget.TurnPageView;


public class MainActivity extends ActionBarActivity {

	private TurnPageView turnPageView;

	private List<Bitmap> bitmapList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bitmapList = new ArrayList<>();

		bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.nick1));
		bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.nick2));
		bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.nick3));

		turnPageView = (TurnPageView) findViewById(R.id.trun_page);

		turnPageView.setBitmaps(bitmapList);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
