package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import com.facebook.internal.AnalyticsEvents;
import q0.l;

@StabilityInferred
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class PointerInteropFilter implements PointerInputModifier {

    /* renamed from: a, reason: collision with root package name */
    public l f15619a;

    /* renamed from: b, reason: collision with root package name */
    public RequestDisallowInterceptTouchEvent f15620b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15621c;
    public final PointerInteropFilter$pointerInputFilter$1 d = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class DispatchToViewState {

        /* renamed from: a, reason: collision with root package name */
        public static final DispatchToViewState f15622a;

        /* renamed from: b, reason: collision with root package name */
        public static final DispatchToViewState f15623b;

        /* renamed from: c, reason: collision with root package name */
        public static final DispatchToViewState f15624c;
        public static final /* synthetic */ DispatchToViewState[] d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState] */
        static {
            ?? r02 = new Enum(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 0);
            f15622a = r02;
            ?? r1 = new Enum("Dispatching", 1);
            f15623b = r1;
            ?? r2 = new Enum("NotDispatching", 2);
            f15624c = r2;
            d = new DispatchToViewState[]{r02, r1, r2};
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public final PointerInteropFilter$pointerInputFilter$1 q1() {
        return this.d;
    }
}
