package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.cooldev.gba.emulator.gameboy.R;

/* loaded from: classes4.dex */
public class ContextThemeWrapper extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f596f;

    /* renamed from: a, reason: collision with root package name */
    public int f597a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f598b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f599c;
    public Configuration d;
    public Resources e;

    public ContextThemeWrapper(Context context, int i2) {
        super(context);
        this.f597a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f598b == null) {
            this.f598b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f598b.setTo(theme);
            }
        }
        this.f598b.applyStyle(this.f597a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f596f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f596f = configuration2;
                }
                if (!configuration.equals(f596f)) {
                    this.e = createConfigurationContext(this.d).getResources();
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f599c == null) {
            this.f599c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f599c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f598b;
        if (theme != null) {
            return theme;
        }
        if (this.f597a == 0) {
            this.f597a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f598b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f597a != i2) {
            this.f597a = i2;
            b();
        }
    }
}
