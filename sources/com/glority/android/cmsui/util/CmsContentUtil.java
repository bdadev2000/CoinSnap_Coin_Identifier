package com.glority.android.cmsui.util;

import com.glority.android.cmsui.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: CmsUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/glority/android/cmsui/util/CmsContentUtil;", "", "()V", "DETAIL_CONTENT_MAX_LINES", "", "FAQ_CONTENT_MAX_LINES", "difficultyRateContents", "", "getDifficultyRateContents", "()Ljava/util/List;", "difficultyRateContents$delegate", "Lkotlin/Lazy;", "faqActionMap", "", "", "getFaqActionMap", "()Ljava/util/Map;", "faqActionMap$delegate", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsContentUtil {
    public static final int DETAIL_CONTENT_MAX_LINES = 5;
    public static final int FAQ_CONTENT_MAX_LINES = 3;
    public static final CmsContentUtil INSTANCE = new CmsContentUtil();

    /* renamed from: difficultyRateContents$delegate, reason: from kotlin metadata */
    private static final Lazy difficultyRateContents = LazyKt.lazy(new Function0<List<Integer>>() { // from class: com.glority.android.cmsui.util.CmsContentUtil$difficultyRateContents$2
        @Override // kotlin.jvm.functions.Function0
        public final List<Integer> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(R.string.text_plant_no_die_grow));
            arrayList.add(Integer.valueOf(R.string.text_plant_super_easy_grow));
            arrayList.add(Integer.valueOf(R.string.text_plant_easy_grow));
            arrayList.add(Integer.valueOf(R.string.text_plant_difficult_grow));
            arrayList.add(Integer.valueOf(R.string.text_plant_very_difficult_grow));
            arrayList.add(Integer.valueOf(R.string.text_plant_impossible_grow));
            return arrayList;
        }
    });

    /* renamed from: faqActionMap$delegate, reason: from kotlin metadata */
    private static final Lazy faqActionMap = LazyKt.lazy(new Function0<Map<String, Integer>>() { // from class: com.glority.android.cmsui.util.CmsContentUtil$faqActionMap$2
        @Override // kotlin.jvm.functions.Function0
        public final Map<String, Integer> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("PlantCare", 2);
            linkedHashMap.put("Weed", 1);
            linkedHashMap.put("Harm", 3);
            linkedHashMap.put("PestControl", 4);
            return linkedHashMap;
        }
    });

    public final List<Integer> getDifficultyRateContents() {
        return (List) difficultyRateContents.getValue();
    }

    public final Map<String, Integer> getFaqActionMap() {
        return (Map) faqActionMap.getValue();
    }

    private CmsContentUtil() {
    }
}
