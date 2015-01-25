package demo.binea.com.turnpageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;
import java.util.List;

import demo.binea.com.turnpageview.widget.FoldView;


public class MainActivity extends ActionBarActivity {

	private FoldView turnPageView;

	private List<Bitmap> bitmapList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bitmapList = new ArrayList<>();

		bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.nick1));
		bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.nick2));
		bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.nick3));

		turnPageView = (FoldView) findViewById(R.id.trun_page);

		turnPageView.setBitmaps(bitmapList);
	}
}
