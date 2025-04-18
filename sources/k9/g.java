package k9;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.r0;
import java.util.Locale;
import n9.h0;

/* loaded from: classes3.dex */
public final class g extends v {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final SparseArray K;
    public final SparseBooleanArray L;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20424w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20425x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20426y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20427z;

    public g(Context context) {
        c(context);
        d(context);
        this.K = new SparseArray();
        this.L = new SparseBooleanArray();
        b();
    }

    @Override // k9.v
    public final v a(int i10, int i11) {
        super.a(i10, i11);
        return this;
    }

    public final void b() {
        this.f20424w = true;
        this.f20425x = false;
        this.f20426y = true;
        this.f20427z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = true;
        this.J = false;
    }

    public final void c(Context context) {
        CaptioningManager captioningManager;
        String locale;
        int i10 = h0.a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f20496p = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i10 >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.f20495o = r0.o(locale);
                }
            }
        }
    }

    public final void d(Context context) {
        Display display;
        Point point;
        String x10;
        String[] split;
        DisplayManager displayManager;
        int i10 = h0.a;
        if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && h0.G(context)) {
            if (i10 < 28) {
                x10 = h0.x("sys.display-size");
            } else {
                x10 = h0.x("vendor.display-size");
            }
            if (!TextUtils.isEmpty(x10)) {
                try {
                    split = x10.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        a(point.x, point.y);
                    }
                }
                n9.o.c("Util", "Invalid display size: " + x10);
            }
            if ("Sony".equals(h0.f22545c) && h0.f22546d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                a(point.x, point.y);
            }
        }
        point = new Point();
        if (i10 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i10 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        a(point.x, point.y);
    }

    public g() {
        this.K = new SparseArray();
        this.L = new SparseBooleanArray();
        b();
    }
}
