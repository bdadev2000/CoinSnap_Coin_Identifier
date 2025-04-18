package androidx.activity;

import android.view.View;
import y0.m;
import y0.n;

/* loaded from: classes4.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner a(View view) {
        p0.a.s(view, "<this>");
        return (OnBackPressedDispatcherOwner) m.M(m.Q(n.J(view, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.f198a), ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.f199a));
    }

    public static final void b(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        p0.a.s(view, "<this>");
        p0.a.s(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(com.cooldev.gba.emulator.gameboy.R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
