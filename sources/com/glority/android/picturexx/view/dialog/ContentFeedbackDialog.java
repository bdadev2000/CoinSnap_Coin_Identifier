package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.business.R;
import com.glority.android.ui.base.LocaleManager;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog;
import com.glority.base.contentfeedback.item.ContentFeedbackControl;
import com.glority.base.contentfeedback.item.ContentFeedbackEditContentPage;
import com.glority.base.contentfeedback.item.ContentFeedbackSelectPage;
import com.glority.base.contentfeedback.item.ContentFeedbackTextItem;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentFeedbackDialog.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bJ^\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bJ&\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ContentFeedbackDialog;", "", "<init>", "()V", "openGradePriceFeedbackDialog", "Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "from", "", "name", "type", "yearMintMark", "grade", "price", "ab", Args.varietyUid, "openIdentifyDetailFeedbackDialog", "", "itemId", "", Args.year, "openMeSummaryFeedbackDialog", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ContentFeedbackDialog {
    public static final int $stable = 0;
    public static final ContentFeedbackDialog INSTANCE = new ContentFeedbackDialog();

    private ContentFeedbackDialog() {
    }

    public final ContentFeedbackBottomSheetDialog openGradePriceFeedbackDialog(Context context, FragmentManager fragmentManager, String from, String name, String type, String yearMintMark, String grade, String price, String ab, String varietyUid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        ContentFeedbackControl contentFeedbackControl = new ContentFeedbackControl(new ContentFeedbackSelectPage(Integer.valueOf(R.string.garde_feedback_Popups_title), CollectionsKt.listOf((Object[]) new ContentFeedbackTextItem[]{new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback1), R.string.garde_feedback_Popups_choose7, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback7), R.string.garde_feedback_Popups_choose1, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback2), R.string.garde_feedback_Popups_choose2, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback3), R.string.garde_feedback_Popups_choose3, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback6), R.string.garde_feedback_Popups_choose6, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback4), R.string.garde_feedback_Popups_choose4, Integer.valueOf(R.string.garde_feedback_Popups_Paratext1), true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback5), R.string.garde_feedback_Popups_choose5, Integer.valueOf(R.string.garde_feedback_Popups_Paratext2), true, new ContentFeedbackEditContentPage(Integer.valueOf(R.string.garde_feedback_Popups_choose5), Integer.valueOf(R.string.grade_feedback_popups_paratext3), R.string.text_submit, context.getResources().getDrawable(R.drawable.gl_bottom_sheet_bg), null))}), context.getResources().getDrawable(R.drawable.gl_bottom_sheet_bg)), R.string.text_grading_survey_done);
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("type", type));
        if (yearMintMark != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_2, yearMintMark);
        }
        if (grade != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_3, grade);
        }
        if (price != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_4, price);
        }
        if (ab != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_5, ab);
        }
        if (varietyUid != null) {
            bundleOf.putString("value", varietyUid);
        }
        ContentFeedbackBottomSheetDialog.Companion companion = ContentFeedbackBottomSheetDialog.INSTANCE;
        String language = LocaleManager.getInstance().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return companion.open(fragmentManager, contentFeedbackControl, from, name, LogEvents.feedback_grade, language, bundleOf);
    }

    public final void openIdentifyDetailFeedbackDialog(Context context, FragmentManager fragmentManager, long itemId, String from, String name, String type, String year, String price, String varietyUid, String ab) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        ContentFeedbackControl contentFeedbackControl = new ContentFeedbackControl(new ContentFeedbackSelectPage(null, CollectionsKt.listOf((Object[]) new ContentFeedbackTextItem[]{new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_price_feedback1), R.string.price_feedback_Popups_choose1, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_price_feedback2), R.string.feedback_Popups_choose2, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_price_feedback3), R.string.feedback_Popups_choose3, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_price_feedback4), R.string.feedback_Popups_choose4, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_price_feedback6), R.string.feedback_Popups_choose5, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback5), R.string.garde_feedback_Popups_choose5, Integer.valueOf(R.string.garde_feedback_Popups_Paratext2), true, new ContentFeedbackEditContentPage(Integer.valueOf(R.string.garde_feedback_Popups_choose5), Integer.valueOf(R.string.grade_feedback_popups_paratext3), R.string.text_submit, context.getResources().getDrawable(R.drawable.gl_bottom_sheet_bg), null))}), context.getResources().getDrawable(R.drawable.gl_bottom_sheet_bg)), R.string.text_grading_survey_done);
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("type", type));
        if (year != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_2, year);
        }
        bundleOf.putString("id", String.valueOf(itemId));
        if (price != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_4, price);
        }
        if (ab != null) {
            bundleOf.putString(LogEventArguments.ARG_STRING_5, ab);
        }
        if (varietyUid != null) {
            bundleOf.putString("value", varietyUid);
        }
        ContentFeedbackBottomSheetDialog.Companion companion = ContentFeedbackBottomSheetDialog.INSTANCE;
        String language = LocaleManager.getInstance().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        companion.open(fragmentManager, contentFeedbackControl, from, name, LogEvents.feedback_price, language, bundleOf);
    }

    public final void openMeSummaryFeedbackDialog(Context context, FragmentManager fragmentManager, String from, String type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(type, "type");
        ContentFeedbackControl contentFeedbackControl = new ContentFeedbackControl(new ContentFeedbackSelectPage(null, CollectionsKt.listOf((Object[]) new ContentFeedbackTextItem[]{new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_price_feedback1), R.string.price_feedback_Popups_choose1, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_me_summary_feedback_dislike), R.string.content_feedback_dislike, null, true, null), new ContentFeedbackTextItem(Integer.valueOf(R.drawable.icon_grade_feedback5), R.string.garde_feedback_Popups_choose5, Integer.valueOf(R.string.garde_feedback_Popups_Paratext2), true, new ContentFeedbackEditContentPage(Integer.valueOf(R.string.garde_feedback_Popups_choose5), Integer.valueOf(R.string.grade_feedback_popups_paratext3), R.string.text_submit, context.getResources().getDrawable(R.drawable.gl_bottom_sheet_bg), null))}), context.getResources().getDrawable(R.drawable.gl_bottom_sheet_bg)), R.string.text_grading_survey_done);
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("type", type));
        ContentFeedbackBottomSheetDialog.Companion companion = ContentFeedbackBottomSheetDialog.INSTANCE;
        String language = LocaleManager.getInstance().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        companion.open(fragmentManager, contentFeedbackControl, from, from, LogEvents.feedback_summary, language, bundleOf);
    }
}
