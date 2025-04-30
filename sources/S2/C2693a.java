package s2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2693a implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22966a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f22967c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f22968d;

    /* renamed from: e, reason: collision with root package name */
    public final Display f22969e;

    public C2693a(Context context) {
        this.f22968d = context;
        this.f22969e = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i9) {
        this.f22966a = true;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i9) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i9) {
    }
}
