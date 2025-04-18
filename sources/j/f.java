package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f19657f;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f19658b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f19659c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f19660d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f19661e;

    public f(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f19661e == null) {
            if (this.f19660d == null) {
                this.f19660d = new Configuration(configuration);
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
        boolean z10;
        if (this.f19658b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f19658b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f19658b.setTo(theme);
            }
        }
        this.f19658b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(j.f.f19657f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f19661e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f19660d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = j.f.f19657f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            j.f.f19657f = r1
        L1c:
            android.content.res.Configuration r1 = j.f.f19657f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f19660d
            android.content.Context r0 = j.e.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f19661e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f19661e = r0
        L38:
            android.content.res.Resources r0 = r3.f19661e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f19659c == null) {
                this.f19659c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f19659c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f19658b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f19658b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.a != i10) {
            this.a = i10;
            b();
        }
    }

    public f(Context context, Resources.Theme theme) {
        super(context);
        this.f19658b = theme;
    }
}
