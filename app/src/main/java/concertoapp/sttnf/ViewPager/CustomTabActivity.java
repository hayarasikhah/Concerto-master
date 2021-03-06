package concertoapp.sttnf.ViewPager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import concertoapp.sttnf.Fragment.CallsFragment;
//import concertoapp.sttnf.Fragment.ChatFragment;
import concertoapp.sttnf.Fragment.ContactsFragment;
import concertoapp.sttnf.R;
import concertoapp.sttnf.ViewPagerAdapter;

public class CustomTabActivity extends AppCompatActivity {

    //This is our tablayout
    private TabLayout tabLayout;

    //This is our viewPager
    private ViewPager viewPager;

    //Fragments

    //ChatFragment chatFragment;
    CallsFragment callsFragment;
    ContactsFragment contactsFragment;

    String[] tabTitle={"CALLS","CHAT","CONTACTS"};
    int[] unreadCount={0,5,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tab_with_icon);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(3);
        setupViewPager(viewPager);

        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

        try
        {
            setupTabIcons();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        // Associate searchable configuration with the SearchView
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_status:
                Toast.makeText(this, "Home Status Click", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this, "Home Settings Click", Toast.LENGTH_SHORT).show();
                return true;
           /** case R.id.action_with_icon:
                Intent withicon=new Intent(this,TabWithIconActivity.class);
                startActivity(withicon);
                finish();
                return true; **/

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setupViewPager(ViewPager viewPager)
    {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        callsFragment=new CallsFragment();
        //chatFragment=new ChatFragment();
        contactsFragment=new ContactsFragment();

        adapter.addFragment(callsFragment,"CALLS");
        //adapter.addFragment(chatFragment,"CHAT");
        adapter.addFragment(contactsFragment,"CONTACTS");

        viewPager.setAdapter(adapter);
    }

    private View prepareTabView(int pos) {
        View view = getLayoutInflater().inflate(R.layout.item_custom_tab,null);
        TextView tv_title = (TextView) view.findViewById(R.id.tv_title);
       // tv_title.setText(tabTitle[pos]);


        return view;
    }

    private void setupTabIcons()
    {

        for(int i=0;i<tabTitle.length;i++)
        {
            /*TabLayout.Tab tabitem = tabLayout.newTab();
            tabitem.setCustomView(prepareTabView(i));
            tabLayout.addTab(tabitem);*/

            tabLayout.getTabAt(i).setCustomView(prepareTabView(i));
        }


    }
}
