package com.glority.android.picturexx.cms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: GradingReportCmsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0003"}, d2 = {"handlingUnnecessaryData", "", "data", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GradingReportCmsItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlingUnnecessaryData(String str) {
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"\n"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
        if (mutableList.size() <= 2) {
            return "";
        }
        ArrayList arrayList4 = new ArrayList();
        for (String str2 : mutableList) {
            if (StringsKt.startsWith$default(str2, "**", false, 2, (Object) null)) {
                arrayList4.addAll(CollectionsKt.listOf((Object[]) new String[]{"\n", str2 + "\n"}));
            } else {
                arrayList4.add(str2);
            }
        }
        List arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.trim((CharSequence) obj2).toString(), " ", "", false, 4, (Object) null), ":", "", false, 4, (Object) null);
            if (!StringsKt.contains((CharSequence) replace$default, (CharSequence) "endgraderesult", true) && !StringsKt.contains((CharSequence) replace$default, (CharSequence) "coinanalysisresults", true)) {
                arrayList5.add(obj2);
            }
        }
        List list = arrayList5;
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (StringsKt.contains((CharSequence) it2.next(), (CharSequence) "Undisplayed_Grade: ", true)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            list = list.subList(0, i);
        }
        return CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, null, 62, null);
    }
}
