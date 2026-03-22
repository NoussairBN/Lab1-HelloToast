package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Compteur d'attaques repoussées
    private int blockedAttempts = 0;

    // Référence vers l'écran d'affichage
    private TextView tvBlockedCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Lie au nouveau design sombre

        // Radar : on récupère nos nouveaux éléments XML
        tvBlockedCount = findViewById(R.id.tv_blocked_count);
        Button btnScan = findViewById(R.id.btn_network_scan);
        Button btnAttack = findViewById(R.id.btn_simulate_attack);

        // Action 1 : Lancer un scan (Le fameux Toast)
        btnScan.setOnClickListener(v -> {
            Toast.makeText(this, "CyberSentinel Actif : Réseau sécurisé.", Toast.LENGTH_SHORT).show();
        });

        // Action 2 : Simuler l'attaque (Le Compteur)
        btnAttack.setOnClickListener(v -> {
            blockedAttempts++; // Ajoute +1 aux attaques
            tvBlockedCount.setText(String.valueOf(blockedAttempts));
        });
    }
}