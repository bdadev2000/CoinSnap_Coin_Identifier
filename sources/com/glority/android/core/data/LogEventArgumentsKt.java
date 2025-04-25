package com.glority.android.core.data;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEventArguments.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012.\u0010\u0003\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0002\u0010\b\u001a;\u0010\t\u001a\u00020\u00012.\u0010\u0003\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"logEventBundleAdd", "Landroid/os/Bundle;", "bundle", "pairs", "", "Lkotlin/Pair;", "", "", "(Landroid/os/Bundle;[Lkotlin/Pair;)Landroid/os/Bundle;", "logEventBundleOf", "([Lkotlin/Pair;)Landroid/os/Bundle;", "fwk-core_release"}, k = 2, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LogEventArgumentsKt {
    public static final Bundle logEventBundleOf(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Bundle bundle = new Bundle();
        int length = pairs.length;
        int i = 0;
        while (i < length) {
            Pair<String, ? extends Object> pair = pairs[i];
            i++;
            String component1 = pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(component1, null);
            } else if (LogEventArguments.INSTANCE.getINT_PARAMETER_ARRAY().contains(component1)) {
                if (component2 instanceof Byte) {
                    bundle.putInt(component1, ((Number) component2).byteValue());
                } else if (component2 instanceof Short) {
                    bundle.putInt(component1, ((Number) component2).shortValue());
                } else if (component2 instanceof Integer) {
                    bundle.putInt(component1, ((Number) component2).intValue());
                } else if (component2 instanceof Long) {
                    bundle.putInt(component1, (int) ((Number) component2).longValue());
                } else {
                    bundle.putAll(BundleKt.bundleOf(TuplesKt.to(component1, component2)));
                }
            } else if (LogEventArguments.INSTANCE.getFLOAT_PARAMETER_ARRAY().contains(component1)) {
                if (component2 instanceof Byte) {
                    bundle.putFloat(component1, ((Number) component2).byteValue());
                } else if (component2 instanceof Short) {
                    bundle.putFloat(component1, ((Number) component2).shortValue());
                } else if (component2 instanceof Integer) {
                    bundle.putFloat(component1, ((Number) component2).intValue());
                } else if (component2 instanceof Long) {
                    bundle.putFloat(component1, (float) ((Number) component2).longValue());
                } else if (component2 instanceof Float) {
                    bundle.putFloat(component1, ((Number) component2).floatValue());
                } else if (component2 instanceof Double) {
                    bundle.putFloat(component1, (float) ((Number) component2).doubleValue());
                } else {
                    bundle.putAll(BundleKt.bundleOf(TuplesKt.to(component1, component2)));
                }
            } else if (LogEventArguments.INSTANCE.getDOUBLE_PARAMETER_ARRAY().contains(component1)) {
                if (component2 instanceof Byte) {
                    bundle.putDouble(component1, ((Number) component2).byteValue());
                } else if (component2 instanceof Short) {
                    bundle.putDouble(component1, ((Number) component2).shortValue());
                } else if (component2 instanceof Integer) {
                    bundle.putDouble(component1, ((Number) component2).intValue());
                } else if (component2 instanceof Long) {
                    bundle.putDouble(component1, ((Number) component2).longValue());
                } else if (component2 instanceof Float) {
                    bundle.putDouble(component1, ((Number) component2).floatValue());
                } else if (component2 instanceof Double) {
                    bundle.putDouble(component1, ((Number) component2).doubleValue());
                } else {
                    bundle.putAll(BundleKt.bundleOf(TuplesKt.to(component1, component2)));
                }
            } else if (LogEventArguments.INSTANCE.getSTRING_PARAMETER_ARRAY().contains(component1)) {
                if (component2 instanceof Byte) {
                    bundle.putString(component1, String.valueOf(((Number) component2).intValue()));
                } else if (component2 instanceof Short) {
                    bundle.putString(component1, String.valueOf(((Number) component2).intValue()));
                } else if (component2 instanceof Integer) {
                    bundle.putString(component1, String.valueOf(((Number) component2).intValue()));
                } else if (component2 instanceof Long) {
                    bundle.putString(component1, String.valueOf(((Number) component2).longValue()));
                } else if (component2 instanceof Float) {
                    bundle.putString(component1, String.valueOf(((Number) component2).floatValue()));
                } else if (component2 instanceof Double) {
                    bundle.putString(component1, String.valueOf(((Number) component2).doubleValue()));
                } else if (component2 instanceof Boolean) {
                    bundle.putString(component1, String.valueOf(((Boolean) component2).booleanValue()));
                } else if (component2 instanceof String) {
                    bundle.putString(component1, (String) component2);
                } else {
                    bundle.putString(component1, component2.toString());
                }
            } else {
                bundle.putString(component1, component2.toString());
            }
        }
        return bundle;
    }

    public static final Bundle logEventBundleAdd(Bundle bundle, Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        bundle.putAll(logEventBundleOf((Pair[]) Arrays.copyOf(pairs, pairs.length)));
        return bundle;
    }
}
