package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.n;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.ViewKt;
import b1.f0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import p0.a;

/* loaded from: classes4.dex */
public final class PoolingContainer {
    public static final void a(View view, n nVar) {
        a.s(view, "<this>");
        d(view).f18924a.add(nVar);
    }

    public static final void b(View view) {
        a.s(view, "<this>");
        Iterator it = ViewKt.a(view).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = d((View) it.next()).f18924a;
            for (int p2 = f0.p(arrayList); -1 < p2; p2--) {
                ((PoolingContainerListener) arrayList.get(p2)).a();
            }
        }
    }

    public static final void c(ViewGroup viewGroup) {
        a.s(viewGroup, "<this>");
        Iterator it = new ViewGroupKt$children$1(viewGroup).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            ArrayList arrayList = d((View) viewGroupKt$iterator$1.next()).f18924a;
            for (int p2 = f0.p(arrayList); -1 < p2; p2--) {
                ((PoolingContainerListener) arrayList.get(p2)).a();
            }
        }
    }

    public static final PoolingContainerListenerHolder d(View view) {
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(com.cooldev.gba.emulator.gameboy.R.id.pooling_container_listener_holder_tag);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(com.cooldev.gba.emulator.gameboy.R.id.pooling_container_listener_holder_tag, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final void e(AbstractComposeView abstractComposeView, PoolingContainerListener poolingContainerListener) {
        a.s(abstractComposeView, "<this>");
        a.s(poolingContainerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d(abstractComposeView).f18924a.remove(poolingContainerListener);
    }
}
