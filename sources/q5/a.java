package Q5;

import L4.f;
import O5.k;
import R5.c;
import R5.i;
import R5.j;
import Z5.h;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import b6.g;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d6.AbstractC2191a;
import java.util.Collections;
import java.util.Iterator;
import q4.C2645d;

/* loaded from: classes3.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2522a = 0;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f2523c;

    /* renamed from: d, reason: collision with root package name */
    public float f2524d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2525e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2526f;

    public a(Handler handler, Context context, f fVar, j jVar) {
        super(handler);
        this.b = context;
        this.f2523c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f2525e = fVar;
        this.f2526f = jVar;
    }

    public final float a() {
        switch (this.f2522a) {
            case 0:
                AudioManager audioManager = this.f2523c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                ((f) this.f2525e).getClass();
                if (streamMaxVolume <= 0 || streamVolume <= 0) {
                    return 0.0f;
                }
                float f9 = streamVolume / streamMaxVolume;
                if (f9 > 1.0f) {
                    return 1.0f;
                }
                return f9;
            default:
                AudioManager audioManager2 = this.f2523c;
                int streamVolume2 = audioManager2.getStreamVolume(3);
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                ((C2645d) this.f2525e).getClass();
                if (streamMaxVolume2 <= 0 || streamVolume2 <= 0) {
                    return 0.0f;
                }
                float f10 = streamVolume2 / streamMaxVolume2;
                if (f10 > 1.0f) {
                    return 1.0f;
                }
                return f10;
        }
    }

    public final void b() {
        switch (this.f2522a) {
            case 0:
                float f9 = this.f2524d;
                j jVar = (j) this.f2526f;
                jVar.b = f9;
                if (((c) jVar.f2758f) == null) {
                    jVar.f2758f = c.f2741c;
                }
                Iterator it = Collections.unmodifiableCollection(((c) jVar.f2758f).b).iterator();
                while (it.hasNext()) {
                    T5.a aVar = ((k) it.next()).f2232e;
                    i.f2751a.a(aVar.f(), "setDeviceVolume", Float.valueOf(f9), aVar.f3019a);
                }
                return;
            default:
                float f10 = this.f2524d;
                j jVar2 = (j) this.f2526f;
                jVar2.b = f10;
                if (((b6.c) jVar2.f2758f) == null) {
                    jVar2.f2758f = b6.c.f5337c;
                }
                Iterator it2 = Collections.unmodifiableCollection(((b6.c) jVar2.f2758f).b).iterator();
                while (it2.hasNext()) {
                    AbstractC2191a abstractC2191a = ((h) it2.next()).f3901e;
                    g.f5341a.a(abstractC2191a.e(), "setDeviceVolume", Float.valueOf(f10), abstractC2191a.f19912a);
                }
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        int i9 = this.f2522a;
        super.onChange(z8);
        float a6 = a();
        switch (i9) {
            case 0:
                if (a6 != this.f2524d) {
                    this.f2524d = a6;
                    b();
                    return;
                }
                return;
            default:
                if (a6 != this.f2524d) {
                    this.f2524d = a6;
                    b();
                    return;
                }
                return;
        }
    }

    public a(Handler handler, Context context, C2645d c2645d, j jVar) {
        super(handler);
        this.b = context;
        this.f2523c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f2525e = c2645d;
        this.f2526f = jVar;
    }
}
