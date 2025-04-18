package f;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import d0.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class c extends b {
    @Override // f.b
    public final Intent a(ComponentActivity context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // f.b
    public final a b(ComponentActivity context, Object obj) {
        boolean z10;
        boolean z11;
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z12 = true;
        int i10 = 0;
        if (input.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a(MapsKt.emptyMap(), i10);
        }
        int length = input.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (h.checkSelfPermission(context, input[i11]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i11++;
        }
        if (z12) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
            for (String str : input) {
                Pair pair = TuplesKt.to(str, Boolean.TRUE);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new a(linkedHashMap, i10);
        }
        return null;
    }

    @Override // f.b
    public final Object c(int i10, Intent intent) {
        boolean z10;
        if (i10 != -1) {
            return MapsKt.emptyMap();
        }
        if (intent == null) {
            return MapsKt.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(Boolean.valueOf(z10));
            }
            return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
        }
        return MapsKt.emptyMap();
    }
}
