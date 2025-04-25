package com.glority.android.picturexx.vm;

import com.glority.android.picturexx.cms.GradingReportCmsItem;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: GradingDetailViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"getGradingGPTResult", "", "Lcom/glority/android/picturexx/cms/GradingReportCmsItem$Companion;", "data", "getGradingGPTResultEn", "getGradingGPTResultOther", "getOrgResultEn", "content", "getOrgResultOther", "checkGrade", "gradeString", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingDetailViewModelKt {
    public static final String getGradingGPTResult(GradingReportCmsItem.Companion companion, String data) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (AppViewModel.INSTANCE.getInstance().getLanguageCode() == LanguageCode.English) {
            return getGradingGPTResultEn(companion, data);
        }
        return getGradingGPTResultOther(companion, data);
    }

    private static final String getGradingGPTResultEn(GradingReportCmsItem.Companion companion, String str) {
        String orgResultEn = getOrgResultEn(str);
        if (orgResultEn == null) {
            return null;
        }
        return checkGrade(orgResultEn);
    }

    public static final String getGradingGPTResultOther(GradingReportCmsItem.Companion companion, String data) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        String orgResultOther = getOrgResultOther(data);
        if (orgResultOther == null) {
            return null;
        }
        return checkGrade(orgResultOther);
    }

    private static final String getOrgResultEn(String str) {
        MatchResult find$default;
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "Grade:", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "\n", false, 2, (Object) null) && (find$default = Regex.find$default(new Regex("Grade: ([^*]+)\\*\\*"), str2, 0, 2, null)) != null) {
            return checkGrade(find$default.getGroupValues().get(1));
        }
        return null;
    }

    private static final String getOrgResultOther(String str) {
        MatchResult find$default;
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "Undisplayed_Grade:", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "\n", false, 2, (Object) null) && (find$default = Regex.find$default(new Regex("Undisplayed_Grade: [*]*([^*]+)[*]*"), str2, 0, 2, null)) != null) {
            return checkGrade(find$default.getGroupValues().get(1));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String checkGrade(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.vm.GradingDetailViewModelKt.checkGrade(java.lang.String):java.lang.String");
    }
}
