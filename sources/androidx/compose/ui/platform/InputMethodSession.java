package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPlatformTextInputSession.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0006R$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "onAllConnectionsClosed", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/jvm/functions/Function0;)V", "connections", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "Landroidx/compose/ui/node/WeakReference;", "disposed", "", "isActive", "()Z", "lock", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "dispose", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class InputMethodSession {
    private boolean disposed;
    private final Function0<Unit> onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;
    private final Object lock = new Object();
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, Function0<Unit> function0) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = function0;
    }

    public final boolean isActive() {
        return !this.disposed;
    }

    public final InputConnection createInputConnection(EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(outAttrs), new Function1<NullableInputConnectionWrapper, Unit>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    invoke2(nullableInputConnectionWrapper);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke2(androidx.compose.ui.text.input.NullableInputConnectionWrapper r5) {
                    /*
                        r4 = this;
                        r5.disposeDelegate()
                        androidx.compose.ui.platform.InputMethodSession r0 = androidx.compose.ui.platform.InputMethodSession.this
                        androidx.compose.runtime.collection.MutableVector r0 = androidx.compose.ui.platform.InputMethodSession.access$getConnections$p(r0)
                        int r1 = r0.getSize()
                        if (r1 <= 0) goto L23
                        java.lang.Object[] r0 = r0.getContent()
                        r2 = 0
                    L14:
                        r3 = r0[r2]
                        java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
                        boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
                        if (r3 == 0) goto L1f
                        goto L24
                    L1f:
                        int r2 = r2 + 1
                        if (r2 < r1) goto L14
                    L23:
                        r2 = -1
                    L24:
                        if (r2 < 0) goto L2f
                        androidx.compose.ui.platform.InputMethodSession r5 = androidx.compose.ui.platform.InputMethodSession.this
                        androidx.compose.runtime.collection.MutableVector r5 = androidx.compose.ui.platform.InputMethodSession.access$getConnections$p(r5)
                        r5.removeAt(r2)
                    L2f:
                        androidx.compose.ui.platform.InputMethodSession r5 = androidx.compose.ui.platform.InputMethodSession.this
                        androidx.compose.runtime.collection.MutableVector r5 = androidx.compose.ui.platform.InputMethodSession.access$getConnections$p(r5)
                        boolean r5 = r5.isEmpty()
                        if (r5 == 0) goto L44
                        androidx.compose.ui.platform.InputMethodSession r5 = androidx.compose.ui.platform.InputMethodSession.this
                        kotlin.jvm.functions.Function0 r5 = androidx.compose.ui.platform.InputMethodSession.access$getOnAllConnectionsClosed$p(r5)
                        r5.invoke()
                    L44:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1.invoke2(androidx.compose.ui.text.input.NullableInputConnectionWrapper):void");
                }
            });
            this.connections.add(new WeakReference<>(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            this.disposed = true;
            MutableVector<WeakReference<NullableInputConnectionWrapper>> mutableVector = this.connections;
            int size = mutableVector.getSize();
            if (size > 0) {
                WeakReference<NullableInputConnectionWrapper>[] content = mutableVector.getContent();
                int i = 0;
                do {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = content[i].get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.disposeDelegate();
                    }
                    i++;
                } while (i < size);
            }
            this.connections.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
