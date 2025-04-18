package md;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import nd.h;
import wh.a0;

/* loaded from: classes4.dex */
public final class a extends ContentObserver {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22219b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f22220c;

    /* renamed from: d, reason: collision with root package name */
    public float f22221d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f22222e;

    /* renamed from: f, reason: collision with root package name */
    public final h f22223f;

    public a(Handler handler, Context context, a0 a0Var, h hVar) {
        super(handler);
        this.f22219b = context;
        this.f22220c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f22222e = a0Var;
        this.f22223f = hVar;
    }

    public final float a() {
        int i10 = this.a;
        a0 a0Var = this.f22222e;
        AudioManager audioManager = this.f22220c;
        switch (i10) {
            case 0:
                return a0Var.e(audioManager.getStreamVolume(3), audioManager.getStreamMaxVolume(3));
            default:
                return a0Var.e(audioManager.getStreamVolume(3), audioManager.getStreamMaxVolume(3));
        }
    }

    public final boolean b(float f10) {
        switch (this.a) {
            case 0:
                if (f10 != this.f22221d) {
                    return true;
                }
                return false;
            default:
                if (f10 != this.f22221d) {
                    return true;
                }
                return false;
        }
    }

    public final void c() {
        int i10 = this.a;
        h hVar = this.f22223f;
        switch (i10) {
            case 0:
                hVar.a(this.f22221d);
                return;
            default:
                hVar.a(this.f22221d);
                return;
        }
    }

    public final void d() {
        int i10 = this.a;
        Context context = this.f22219b;
        switch (i10) {
            case 0:
                this.f22221d = a();
                c();
                context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
                return;
            default:
                this.f22221d = a();
                c();
                context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
                return;
        }
    }

    public final void e() {
        int i10 = this.a;
        Context context = this.f22219b;
        switch (i10) {
            case 0:
                context.getContentResolver().unregisterContentObserver(this);
                return;
            default:
                context.getContentResolver().unregisterContentObserver(this);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.a) {
            case 0:
                super.onChange(z10);
                float a = a();
                if (b(a)) {
                    this.f22221d = a;
                    c();
                    return;
                }
                return;
            default:
                super.onChange(z10);
                float a10 = a();
                if (b(a10)) {
                    this.f22221d = a10;
                    c();
                    return;
                }
                return;
        }
    }

    public a(Handler handler, Context context, a0 a0Var, h hVar, int i10) {
        super(handler);
        this.f22219b = context;
        this.f22220c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f22222e = a0Var;
        this.f22223f = hVar;
    }
}
