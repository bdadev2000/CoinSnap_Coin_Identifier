package androidx.compose.foundation.text.input.internal;

import android.adservices.adid.AdId;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.appsetid.AppSetId;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.SelectGesture;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ void B() {
        new AdSelectionConfig.Builder();
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
        new LeaveCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ AdId f(Object obj) {
        return (AdId) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome g(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* bridge */ /* synthetic */ AppSetId h(Object obj) {
        return (AppSetId) obj;
    }

    public static /* synthetic */ CustomAudience.Builder i() {
        return new CustomAudience.Builder();
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder o(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder p(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof SelectGesture;
    }
}
