package com.glority.android.ui.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: AutoLogEvents.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/glority/android/ui/util/AutoLogEvents;", "", "()V", "CLOSE", "", "HIDE", "OPEN", "SHOW", "defaultDisabledLogEvents", "", "getDefaultDisabledLogEvents", "()Ljava/util/List;", "defaultDisabledLogEvents$delegate", "Lkotlin/Lazy;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class AutoLogEvents {
    public static final String CLOSE = "close";
    public static final String HIDE = "hide";
    public static final String OPEN = "open";
    public static final String SHOW = "show";
    public static final AutoLogEvents INSTANCE = new AutoLogEvents();

    /* renamed from: defaultDisabledLogEvents$delegate, reason: from kotlin metadata */
    private static final Lazy defaultDisabledLogEvents = LazyKt.lazy(new Function0<List<? extends String>>() { // from class: com.glority.android.ui.util.AutoLogEvents$defaultDisabledLogEvents$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            String config = AppContext.INSTANCE.getConfig("DISABLE_AUTO_LOG_EVENTS");
            return config.length() > 0 ? StringsKt.split$default((CharSequence) config, new String[]{","}, false, 0, 6, (Object) null) : CollectionsKt.emptyList();
        }
    });

    private AutoLogEvents() {
    }

    public final List<String> getDefaultDisabledLogEvents() {
        return (List) defaultDisabledLogEvents.getValue();
    }
}
