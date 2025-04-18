package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 f199a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        p0.a.s(view, "it");
        Object tag = view.getTag(com.cooldev.gba.emulator.gameboy.R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
