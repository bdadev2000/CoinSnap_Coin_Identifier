package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f21872f;

    /* renamed from: a, reason: collision with root package name */
    public int f21873a;
    public Resources.Theme b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f21874c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f21875d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f21876e;

    public d(Context context, int i9) {
        super(context);
        this.f21873a = i9;
    }

    public final void a(Configuration configuration) {
        if (this.f21876e == null) {
            if (this.f21875d == null) {
                this.f21875d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.f21873a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(o.d.f21872f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f21876e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f21875d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = o.d.f21872f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            o.d.f21872f = r1
        L1c:
            android.content.res.Configuration r1 = o.d.f21872f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f21875d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f21876e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f21876e = r0
        L38:
            android.content.res.Resources r0 = r3.f21876e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f21874c == null) {
                this.f21874c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f21874c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f21873a == 0) {
            this.f21873a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i9) {
        if (this.f21873a != i9) {
            this.f21873a = i9;
            b();
        }
    }
}
