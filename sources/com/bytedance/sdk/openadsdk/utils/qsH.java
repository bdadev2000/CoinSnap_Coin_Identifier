package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class qsH {
    private static final Map<String, Pair<? extends Drawable, Integer>> YFl = new HashMap();
    private static Integer Sg = null;

    public static Drawable YFl(Context context, String str) {
        return YFl(context, str, true);
    }

    public static Drawable YFl(Context context, String str, boolean z10) {
        Pair<? extends Drawable, Integer> pair;
        Sg = Integer.valueOf(com.bytedance.sdk.openadsdk.core.lG.AlY().ni());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = YFl;
        map.size();
        if (map.containsKey(str) && (pair = map.get(str)) != null) {
            Drawable drawable = (Drawable) pair.first;
            map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
            return drawable;
        }
        YFl();
        return YFl(str, context, z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Drawable YFl(String str, Context context, boolean z10) {
        char c10;
        Drawable drawable;
        Drawable drawable2;
        str.getClass();
        switch (str.hashCode()) {
            case -2137782317:
                if (str.equals("tt_leftbackicon_selector_for_dark")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -2023672829:
                if (str.equals("tt_dislike_dialog_bg")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -2010340681:
                if (str.equals("tt_leftbackbutton_titlebar_photo_preview")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1888785259:
                if (str.equals("tt_seek_progress")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1883903877:
                if (str.equals("tt_dislike_middle_seletor")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1881901373:
                if (str.equals("tt_ad_cover_btn_begin_bg")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1818605128:
                if (str.equals("tt_leftbackicon_selector")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1724866088:
                if (str.equals("tt_seek_thumb_normal")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1698792361:
                if (str.equals("tt_stop_movebar_textpage")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1500492368:
                if (str.equals("tt_backup_btn_1")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -1308443384:
                if (str.equals("tt_ad_report_info_bg")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1222892514:
                if (str.equals("tt_playable_btn_bk")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -1163545839:
                if (str.equals("tt_dislike_bottom_seletor")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case -1150582740:
                if (str.equals("tt_seek_thumb_fullscreen")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -1147412691:
                if (str.equals("tt_custom_dialog_bg")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -1107858393:
                if (str.equals("tt_ad_loading_three_mid")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -876774215:
                if (str.equals("tt_close_move_detail")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case -875200849:
                if (str.equals("tt_mute_btn_bg")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case -847552402:
                if (str.equals("tt_seek_thumb")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -561153052:
                if (str.equals("tt_reward_countdown_bg")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case -508263579:
                if (str.equals("tt_play_movebar_textpage")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case -473198695:
                if (str.equals("tt_refreshing_video_textpage")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case -404284879:
                if (str.equals("tt_playable_progress_style")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case -292612462:
                if (str.equals("tt_seek_thumb_fullscreen_selector")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case -226695937:
                if (str.equals("tt_ad_landing_loading_three_mid")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case -154809169:
                if (str.equals("tt_pangle_ad_mute_btn_bg")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case -97103333:
                if (str.equals("tt_video_black_desc_gradient")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 16094728:
                if (str.equals("tt_ad_loading_three_left")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 27541452:
                if (str.equals("tt_mute_wrapper")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 57270120:
                if (str.equals("tt_dislike_top_bg")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 106179457:
                if (str.equals("tt_comment_tv")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 242455215:
                if (str.equals("tt_reward_full_new_bar_bg")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 247520514:
                if (str.equals("tt_reward_full_video_backup_btn_bg")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 310787585:
                if (str.equals("tt_full_reward_loading_progress_style")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 314734139:
                if (str.equals("tt_detail_video_btn_bg")) {
                    c10 = '\"';
                    break;
                }
                c10 = 65535;
                break;
            case 410262782:
                if (str.equals("tt_pangle_banner_btn_bg")) {
                    c10 = '#';
                    break;
                }
                c10 = 65535;
                break;
            case 484030064:
                if (str.equals("tt_seek_thumb_fullscreen_press")) {
                    c10 = Typography.dollar;
                    break;
                }
                c10 = 65535;
                break;
            case 494589792:
                if (str.equals("tt_browser_download_selector")) {
                    c10 = '%';
                    break;
                }
                c10 = 65535;
                break;
            case 504597563:
                if (str.equals("tt_ad_loading_three_right")) {
                    c10 = Typography.amp;
                    break;
                }
                c10 = 65535;
                break;
            case 507305701:
                if (str.equals("tt_pangle_btn_bg")) {
                    c10 = '\'';
                    break;
                }
                c10 = 65535;
                break;
            case 708409173:
                if (str.equals("tt_privacy_progress_style")) {
                    c10 = '(';
                    break;
                }
                c10 = 65535;
                break;
            case 991946046:
                if (str.equals("tt_privacy_btn_bg")) {
                    c10 = ')';
                    break;
                }
                c10 = 65535;
                break;
            case 1054661938:
                if (str.equals("tt_seek_thumb_press")) {
                    c10 = '*';
                    break;
                }
                c10 = 65535;
                break;
            case 1094767909:
                if (str.equals("tt_unmute_wrapper")) {
                    c10 = '+';
                    break;
                }
                c10 = 65535;
                break;
            case 1115144587:
                if (str.equals("tt_titlebar_close_seletor_for_dark")) {
                    c10 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c10 = 65535;
                break;
            case 1193160467:
                if (str.equals("tt_ad_landing_loading_three_right")) {
                    c10 = '-';
                    break;
                }
                c10 = 65535;
                break;
            case 1234814491:
                if (str.equals("tt_landingpage_loading_text_rect")) {
                    c10 = '.';
                    break;
                }
                c10 = 65535;
                break;
            case 1241312517:
                if (str.equals("tt_shadow_btn_back_withoutnight")) {
                    c10 = '/';
                    break;
                }
                c10 = 65535;
                break;
            case 1360033453:
                if (str.equals("tt_circle_solid_mian")) {
                    c10 = '0';
                    break;
                }
                c10 = 65535;
                break;
            case 1391934389:
                if (str.equals("tt_browser_progress_style")) {
                    c10 = '1';
                    break;
                }
                c10 = 65535;
                break;
            case 1459143575:
                if (str.equals("tt_download_corner_bg")) {
                    c10 = '2';
                    break;
                }
                c10 = 65535;
                break;
            case 1473061455:
                if (str.equals("tt_ad_report_info_button_bg")) {
                    c10 = '3';
                    break;
                }
                c10 = 65535;
                break;
            case 1562327088:
                if (str.equals("tt_ad_landing_loading_three_left")) {
                    c10 = '4';
                    break;
                }
                c10 = 65535;
                break;
            case 1635801742:
                if (str.equals("tt_pangle_ad_close_btn_bg")) {
                    c10 = '5';
                    break;
                }
                c10 = 65535;
                break;
            case 1733712735:
                if (str.equals("tt_lefterbackicon_titlebar_press_wrapper")) {
                    c10 = '6';
                    break;
                }
                c10 = 65535;
                break;
            case 1859118378:
                if (str.equals("tt_reward_video_download_btn_bg")) {
                    c10 = '7';
                    break;
                }
                c10 = 65535;
                break;
            case 1908435428:
                if (str.equals("tt_ad_loading_rect")) {
                    c10 = '8';
                    break;
                }
                c10 = 65535;
                break;
            case 1967077738:
                if (str.equals("tt_shadow_btn_back")) {
                    c10 = '9';
                    break;
                }
                c10 = 65535;
                break;
            case 1986221289:
                if (str.equals("tt_dislike_top_seletor")) {
                    c10 = AbstractJsonLexerKt.COLON;
                    break;
                }
                c10 = 65535;
                break;
            case 1987199879:
                if (str.equals("tt_video_loading_progress_bar")) {
                    c10 = ';';
                    break;
                }
                c10 = 65535;
                break;
            case 1995246663:
                if (str.equals("tt_ad_skip_btn_bg2")) {
                    c10 = Typography.less;
                    break;
                }
                c10 = 65535;
                break;
            case 2051103617:
                if (str.equals("tt_privacy_webview_bg")) {
                    c10 = '=';
                    break;
                }
                c10 = 65535;
                break;
            case 2091139328:
                if (str.equals("tt_titlebar_close_seletor")) {
                    c10 = Typography.greater;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case 1:
                drawable2 = YFl(0, -1, new int[]{GS.tN(context, 8.0f)}, null, null, null);
                break;
            case 2:
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case 3:
                drawable = new LayerDrawable(new Drawable[]{YFl(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{GS.tN(context, 1.5f)}, new int[]{-1, GS.tN(context, 1.0f)}, null, null), new ClipDrawable(YFl(0, -1, new int[]{GS.tN(context, 1.5f)}, new int[]{-1, GS.tN(context, 1.0f)}, null, null), 8388611, 1), new ClipDrawable(YFl(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{GS.tN(context, 1.5f)}, new int[]{-1, GS.tN(context, 1.0f)}, null, null), 8388611, 1)});
                drawable2 = drawable;
                break;
            case 4:
                drawable2 = YFl(YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fde6e6e6")), null, null, null, null), YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fdffffff")), null, null, null, null));
                break;
            case 5:
                drawable2 = YFl(YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_2a90d7")), new int[]{GS.tN(context, 6.0f)}, null, Integer.valueOf(GS.tN(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "@color/tt_7f2a90d7"))), YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_2a90d7")), new int[]{GS.tN(context, 6.0f)}, null, Integer.valueOf(GS.tN(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "@color/tt_2a90d7"))));
                break;
            case 6:
                drawable2 = com.bytedance.sdk.component.utils.qO.tN(context, "tt_lefterbackicon_titlebar");
                break;
            case 7:
                drawable2 = YFl(1, -1, null, new int[]{GS.tN(context, 15.0f), GS.tN(context, 15.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0);
                break;
            case '\b':
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_new_pause_video"));
                break;
            case '\t':
                drawable2 = YFl(YFl(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{GS.tN(context, 4.0f)}, null, null, null), YFl(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{GS.tN(context, 4.0f)}, null, null, null));
                break;
            case '\n':
                drawable2 = YFl(0, -1, new int[]{GS.tN(context, 12.0f), GS.tN(context, 12.0f), 0, 0}, null, null, null);
                break;
            case 11:
                drawable2 = YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_00000000")), new int[]{GS.tN(context, 30.0f)}, null, Integer.valueOf(GS.tN(context, 1.0f)), -1);
                break;
            case '\f':
                drawable2 = YFl(YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fde6e6e6")), new int[]{0, 0, GS.tN(context, 5.0f), GS.tN(context, 5.0f)}, null, null, null), YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fdffffff")), new int[]{0, 0, GS.tN(context, 5.0f), GS.tN(context, 5.0f)}, null, null, null));
                break;
            case '\r':
                drawable2 = YFl(1, -1, null, new int[]{GS.tN(context, 18.0f), GS.tN(context, 18.0f)}, null, null);
                break;
            case 14:
                drawable2 = YFl(0, -1, new int[]{GS.tN(context, 6.0f)}, null, Integer.valueOf(GS.tN(context, 0.8f)), -1);
                break;
            case 15:
                drawable2 = YFl(0, null, null, null, Integer.valueOf(GS.tN(context, 1.5f)), -1);
                break;
            case 16:
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_close_move_details_normal"));
                break;
            case 17:
                drawable2 = YFl(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{GS.tN(context, 28.0f), GS.tN(context, 28.0f)}, null, null);
                break;
            case 18:
                drawable2 = YFl(YFl(1, -1, null, new int[]{GS.tN(context, 22.0f), GS.tN(context, 22.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0), YFl(1, -1, null, new int[]{GS.tN(context, 15.0f), GS.tN(context, 15.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0));
                break;
            case 19:
                drawable2 = YFl(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{GS.tN(context, 28.0f), GS.tN(context, 28.0f)}, null, null);
                break;
            case 20:
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_new_play_video"));
                break;
            case 21:
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_refreshing_video_textpage_normal"));
                break;
            case 22:
                drawable = new LayerDrawable(new Drawable[]{YFl(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{GS.tN(context, 3.0f)}, null, null, null), new ClipDrawable(YFl(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{GS.tN(context, 3.0f)}, null, null, null), 8388611, 1)});
                drawable2 = drawable;
                break;
            case 23:
                drawable2 = YFl(YFl(1, -1, null, new int[]{GS.tN(context, 18.0f), GS.tN(context, 18.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0), YFl(1, -1, null, new int[]{GS.tN(context, 18.0f), GS.tN(context, 18.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0));
                break;
            case 24:
                drawable2 = YFl(0, null, null, null, Integer.valueOf(GS.tN(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 25:
                drawable2 = YFl(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{GS.tN(context, 28.0f), GS.tN(context, 28.0f)}, null, null);
                break;
            case 26:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.qO.DSW(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.qO.DSW(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                drawable = gradientDrawable;
                drawable2 = drawable;
                break;
            case 27:
                drawable2 = YFl(0, null, new int[]{GS.tN(context, 6.0f), 0, 0, GS.tN(context, 6.0f)}, null, Integer.valueOf(GS.tN(context, 1.5f)), -1);
                break;
            case 28:
                Drawable tN = com.bytedance.sdk.component.utils.qO.tN(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], tN);
                stateListDrawable.setAutoMirrored(true);
                drawable = stateListDrawable;
                drawable2 = drawable;
                break;
            case NOTIFICATION_REDIRECT_VALUE:
                drawable2 = YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fdffffff")), new int[]{GS.tN(context, 5.0f), GS.tN(context, 5.0f), 0, 0}, null, null, null);
                break;
            case 30:
                drawable2 = YFl(0, -1, new int[]{GS.tN(context, 4.0f)}, null, Integer.valueOf(GS.tN(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case TEMPLATE_HTML_SIZE_VALUE:
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{GS.tN(context, 18.0f)}, null, null, null);
                break;
            case ' ':
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{GS.tN(context, 6.0f)}, null, null, null);
                break;
            case '!':
                GradientDrawable YFl2 = YFl(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{GS.tN(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(GS.tN(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawable2 = new LayerDrawable(new Drawable[]{YFl2, new ScaleDrawable(gradientDrawable2, 8388611, 1.0f, -1.0f)});
                break;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{GS.tN(context, 4.0f)}, null, null, null);
                break;
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{GS.tN(context, 2.0f)}, new int[]{GS.tN(context, 98.0f), GS.tN(context, 25.0f)}, null, null);
                break;
            case '$':
                drawable2 = YFl(1, -1, null, new int[]{GS.tN(context, 18.0f), GS.tN(context, 18.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0);
                break;
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                drawable2 = YFl(YFl(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), YFl(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                drawable2 = YFl(0, null, new int[]{0, GS.tN(context, 6.0f), GS.tN(context, 6.0f), 0}, null, Integer.valueOf(GS.tN(context, 1.5f)), -1);
                break;
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(GS.tN(context, 280.0f), GS.tN(context, 38.0f));
                gradientDrawable3.setCornerRadius(GS.tN(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                drawable = gradientDrawable3;
                drawable2 = drawable;
                break;
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                drawable2 = new LayerDrawable(new Drawable[]{YFl(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(YFl(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), 8388611, 1)});
                break;
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(GS.tN(context, 258.0f), GS.tN(context, 43.0f));
                gradientDrawable4.setCornerRadius(GS.tN(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                drawable = gradientDrawable4;
                drawable2 = drawable;
                break;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                drawable2 = YFl(1, -1, null, new int[]{GS.tN(context, 22.0f), GS.tN(context, 22.0f)}, Integer.valueOf(GS.tN(context, 1.0f)), 0);
                break;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                Drawable tN2 = com.bytedance.sdk.component.utils.qO.tN(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], tN2);
                stateListDrawable2.setAutoMirrored(true);
                drawable = stateListDrawable2;
                drawable2 = drawable;
                break;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                drawable2 = YFl(com.bytedance.sdk.component.utils.qO.tN(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.qO.tN(context, "tt_titlebar_close_for_dark"));
                break;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                drawable2 = YFl(0, null, new int[]{0, GS.tN(context, 6.0f), GS.tN(context, 6.0f), 0}, null, Integer.valueOf(GS.tN(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{GS.tN(context, 5.0f)}, null, null, null);
                break;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                Drawable tN3 = com.bytedance.sdk.component.utils.qO.tN(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable YFl3 = YFl(tN3, com.bytedance.sdk.component.utils.qO.tN(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                YFl3.addState(new int[]{-16842910}, tN3);
                drawable2 = YFl3;
                break;
            case '0':
                drawable2 = YFl(1, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case '1':
                drawable2 = new LayerDrawable(new Drawable[]{YFl(0, -1, new int[]{0}, null, null, null), new ClipDrawable(YFl(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                drawable2 = YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_4a90e2")), new int[]{GS.tN(context, 4.0f)}, null, null, null);
                break;
            case '3':
                drawable2 = YFl(YFl(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{GS.tN(context, 2.0f)}, null, Integer.valueOf(GS.tN(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), YFl(0, -1, new int[]{GS.tN(context, 2.0f)}, null, Integer.valueOf(GS.tN(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case '4':
                drawable2 = YFl(0, null, new int[]{GS.tN(context, 6.0f), 0, 0, GS.tN(context, 6.0f)}, null, Integer.valueOf(GS.tN(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case '5':
                drawable2 = YFl(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{GS.tN(context, 28.0f), GS.tN(context, 28.0f)}, null, null);
                break;
            case '6':
                Drawable tN4 = com.bytedance.sdk.component.utils.qO.tN(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], tN4);
                stateListDrawable3.setAutoMirrored(true);
                drawable = stateListDrawable3;
                drawable2 = drawable;
                break;
            case '7':
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{GS.tN(context, 18.0f)}, null, null, null);
                break;
            case '8':
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{GS.tN(context, 15.0f)}, null, null, null);
                break;
            case '9':
                Drawable tN5 = com.bytedance.sdk.component.utils.qO.tN(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable YFl4 = YFl(tN5, com.bytedance.sdk.component.utils.qO.tN(context, "tt_shadow_lefterback_titlebar"));
                YFl4.addState(new int[]{-16842910}, tN5);
                drawable2 = YFl4;
                break;
            case ':':
                drawable2 = YFl(YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fde6e6e6")), new int[]{GS.tN(context, 5.0f), GS.tN(context, 5.0f), 0, 0}, null, null, null), YFl(0, Integer.valueOf(com.bytedance.sdk.component.utils.qO.DSW(context, "tt_fdffffff")), new int[]{GS.tN(context, 5.0f), GS.tN(context, 5.0f), 0, 0}, null, null, null));
                break;
            case ';':
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.qO.tN(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                drawable = rotateDrawable;
                drawable2 = drawable;
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                drawable2 = YFl(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{GS.tN(context, 14.0f)}, null, null, null);
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                drawable2 = YFl(0, -1, new int[]{GS.tN(context, 14.5f)}, null, null, null);
                break;
            case '>':
                drawable2 = com.bytedance.sdk.component.utils.qO.tN(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawable2 = null;
                break;
        }
        if (z10) {
            YFl.put(str, new Pair<>(drawable2, 1));
        }
        return drawable2;
    }

    private static void YFl() {
        Map<String, Pair<? extends Drawable, Integer>> map = YFl;
        if (map.size() < Sg.intValue()) {
            return;
        }
        String str = null;
        int i10 = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < i10) {
                str = entry.getKey();
                i10 = ((Integer) entry.getValue().second).intValue();
                if (i10 == 1) {
                    break;
                }
            }
        }
        YFl.remove(str);
    }

    private static GradientDrawable YFl(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i11, i11, i12, i12, i13, i13, i14, i14});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable YFl(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable YFl(Context context, int i10) {
        return YFl(context, Color.parseColor("#1A73E8"), i10);
    }

    public static Drawable YFl(Context context, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(GS.tN(context, i11));
        return gradientDrawable;
    }
}
