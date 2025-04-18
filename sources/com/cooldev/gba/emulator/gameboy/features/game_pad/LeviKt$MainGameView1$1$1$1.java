package com.cooldev.gba.emulator.gameboy.features.game_pad;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class LeviKt$MainGameView1$1$1$1 extends r implements l {
    public static final LeviKt$MainGameView1$1$1$1 INSTANCE = new LeviKt$MainGameView1$1$1$1();

    public LeviKt$MainGameView1$1$1$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final FragmentContainerView invoke(@NotNull Context context) {
        a.s(context, "ctx");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(View.generateViewId());
        GameControlFragment1 gameControlFragment1 = new GameControlFragment1();
        FragmentTransaction d = ((AppCompatActivity) context).getSupportFragmentManager().d();
        d.g(fragmentContainerView.getId(), gameControlFragment1);
        d.c();
        return fragmentContainerView;
    }
}
