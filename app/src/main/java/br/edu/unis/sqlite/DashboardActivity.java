package br.edu.unis.sqlite;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        loadWidgets();

    }

    private void loadWidgets(){

        Button btnToUsers = findViewById(R.id.btn_to_users);
        btnToUsers.setOnClickListener(view -> startActivity(new Intent(this, UserActivity.class)));

        FloatingActionButton btnAddUser = findViewById(R.id.add_user);
        btnAddUser.setOnClickListener(view -> startActivity(new Intent(this, CreateUserActivity.class)));

    }

}