package com.example.projectnt109;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DashBoardActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = null;
    FirebaseAuth firebaseAuth;
    private ViewPager ViewPagergraph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        ViewPagergraph = findViewById(R.id.view);
        setViewPagerDashboard();
        firebaseAuth = FirebaseAuth.getInstance();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id){
                    case R.id.nav_home:
                        ViewPagergraph.setCurrentItem(0);

                        break;
                    case R.id.nav_search:
                        ViewPagergraph.setCurrentItem(1);

                        break;
                    case R.id.nav_group:
                        ViewPagergraph.setCurrentItem(2);

                        break;
                    case R.id.nav_chat:
                        ViewPagergraph.setCurrentItem(3);

                        break;
                    case R.id.nav_user:
                        ViewPagergraph.setCurrentItem(4);

                        break;
                }
                return true;
            }
        });

    }
    private void checkuser(){
        FirebaseUser user= firebaseAuth.getCurrentUser();
        if(user != null)
        {

        }
        else{
            startActivity(new Intent(DashBoardActivity.this, LoginActivity.class));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        checkuser();
    }

    //    private void updateToken(String token){
//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Tokens");
//        Token mToken = new Token(token);
//        ref.child(userId).setValue(mToken);
//    }
    private void setViewPagerDashboard() {
        DashboardFragmentAdapter pagerGraphAdapter = new DashboardFragmentAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        ViewPagergraph.setAdapter(pagerGraphAdapter);
        ViewPagergraph.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.nav_search).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.nav_group).setChecked(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.nav_chat).setChecked(true);
                        break;
                    case 4:
                        bottomNavigationView.getMenu().findItem(R.id.nav_user).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


        });
    }
}

