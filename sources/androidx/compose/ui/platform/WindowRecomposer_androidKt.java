package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.core.os.HandlerCompat;
import b1.b2;
import b1.o0;
import com.cooldev.gba.emulator.gameboy.R;
import d0.b0;
import e1.f1;
import e1.g1;
import g1.u;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f16660a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final g1 a(Context context) {
        g1 g1Var;
        LinkedHashMap linkedHashMap = f16660a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final d1.b a2 = p0.a.a(-1, 0, 6);
                    final Handler a3 = HandlerCompat.a(Looper.getMainLooper());
                    e1.j jVar = new e1.j(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(a3) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z2, Uri uri) {
                            a2.b(b0.f30125a);
                        }
                    }, a2, context, null));
                    b2 d = p0.a.d();
                    h1.d dVar = o0.f22355a;
                    obj = p0.a.x0(jVar, new g1.f(d.u(u.f30639a)), new f1(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                g1Var = (g1) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g1Var;
    }

    public static final CompositionContext b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }
}
