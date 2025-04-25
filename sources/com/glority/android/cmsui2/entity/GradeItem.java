package com.glority.android.cmsui2.entity;

import android.content.Context;
import com.glority.android.cmsui2.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradeItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0019\u001a\u00020\u0000J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/glority/android/cmsui2/entity/GradeItem;", "", "displayGradeNameId", "", "shortNameId", "levelList", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDisplayGradeNameId", "()Ljava/lang/String;", "getShortNameId", "getLevelList", "()Ljava/util/List;", FirebaseAnalytics.Param.LEVEL, "getLevel", "()Ljava/lang/Integer;", "setLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDisplayGradeName", "context", "Landroid/content/Context;", "getShortName", "clone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final /* data */ class GradeItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String displayGradeNameId;
    private Integer level;
    private final List<Integer> levelList;
    private final String shortNameId;

    /* renamed from: component1, reason: from getter */
    public final String getDisplayGradeNameId() {
        return this.displayGradeNameId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShortNameId() {
        return this.shortNameId;
    }

    public final List<Integer> component3() {
        return this.levelList;
    }

    public final GradeItem copy(String displayGradeNameId, String shortNameId, List<Integer> levelList) {
        return new GradeItem(displayGradeNameId, shortNameId, levelList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradeItem)) {
            return false;
        }
        GradeItem gradeItem = (GradeItem) other;
        return Intrinsics.areEqual(this.displayGradeNameId, gradeItem.displayGradeNameId) && Intrinsics.areEqual(this.shortNameId, gradeItem.shortNameId) && Intrinsics.areEqual(this.levelList, gradeItem.levelList);
    }

    public int hashCode() {
        String str = this.displayGradeNameId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortNameId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.levelList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GradeItem(displayGradeNameId=" + this.displayGradeNameId + ", shortNameId=" + this.shortNameId + ", levelList=" + this.levelList + ")";
    }

    public GradeItem(String str, String str2, List<Integer> list) {
        this.displayGradeNameId = str;
        this.shortNameId = str2;
        this.levelList = list;
        this.level = list != null ? (Integer) CollectionsKt.lastOrNull((List) list) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GradeItem copy$default(GradeItem gradeItem, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gradeItem.displayGradeNameId;
        }
        if ((i & 2) != 0) {
            str2 = gradeItem.shortNameId;
        }
        if ((i & 4) != 0) {
            list = gradeItem.levelList;
        }
        return gradeItem.copy(str, str2, list);
    }

    public final String getDisplayGradeNameId() {
        return this.displayGradeNameId;
    }

    public final String getShortNameId() {
        return this.shortNameId;
    }

    public final List<Integer> getLevelList() {
        return this.levelList;
    }

    /* compiled from: GradeItem.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/cmsui2/entity/GradeItem$Companion;", "", "<init>", "()V", "getLevelName", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.LEVEL, "", "(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLevelName(Context context, Integer level) {
            String num;
            Intrinsics.checkNotNullParameter(context, "context");
            if (level != null && (num = level.toString()) != null) {
                return num;
            }
            String string = context.getString(R.string.coinselect_selectgrade_option_uncertain);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    public final Integer getLevel() {
        return this.level;
    }

    public final void setLevel(Integer num) {
        this.level = num;
    }

    public final String getDisplayGradeName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.displayGradeNameId;
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.coinselect_selectgrade_option_uncertain);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String getShortName(Context context) {
        Integer num;
        String str = this.shortNameId;
        if (str != null && (num = this.level) != null) {
            return str + "-" + num;
        }
        if (str != null) {
            return str;
        }
        String string = context != null ? context.getString(R.string.coinselect_selectgrade_option_uncertain) : null;
        return string == null ? "" : string;
    }

    public final GradeItem clone() {
        return new GradeItem(this.displayGradeNameId, this.shortNameId, this.levelList);
    }
}
