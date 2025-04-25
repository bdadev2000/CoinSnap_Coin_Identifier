package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalLifecycleOwner.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LocalLifecycleOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner$annotations", "()V", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LocalLifecycleOwnerKt {
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner;

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    static {
        Object m8274constructorimpl;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (annotations[i] instanceof Deprecated) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    Object invoke = method.invoke(null, new Object[0]);
                    if (invoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) invoke;
                    }
                }
            }
            providableCompositionLocal = null;
            m8274constructorimpl = Result.m8274constructorimpl(providableCompositionLocal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8274constructorimpl = Result.m8274constructorimpl(ResultKt.createFailure(th));
        }
        ProvidableCompositionLocal<LifecycleOwner> providableCompositionLocal2 = (ProvidableCompositionLocal) (Result.m8280isFailureimpl(m8274constructorimpl) ? null : m8274constructorimpl);
        if (providableCompositionLocal2 == null) {
            providableCompositionLocal2 = CompositionLocalKt.staticCompositionLocalOf(new Function0<LifecycleOwner>() { // from class: androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LifecycleOwner invoke() {
                    throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString());
                }
            });
        }
        LocalLifecycleOwner = providableCompositionLocal2;
    }
}
