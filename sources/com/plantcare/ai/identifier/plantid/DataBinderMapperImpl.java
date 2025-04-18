package com.plantcare.ai.identifier.plantid;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.view.MotionEventCompat;
import androidx.databinding.a;
import androidx.databinding.e;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import eb.j;
import java.util.ArrayList;
import java.util.List;
import kf.a2;
import kf.a3;
import kf.b;
import kf.b0;
import kf.b1;
import kf.c2;
import kf.c3;
import kf.d;
import kf.d0;
import kf.d1;
import kf.e2;
import kf.e3;
import kf.f;
import kf.f0;
import kf.f1;
import kf.g2;
import kf.g3;
import kf.h;
import kf.h0;
import kf.h1;
import kf.i2;
import kf.i3;
import kf.j0;
import kf.j1;
import kf.k2;
import kf.k3;
import kf.l;
import kf.l0;
import kf.l1;
import kf.m1;
import kf.m2;
import kf.n;
import kf.n0;
import kf.o1;
import kf.o2;
import kf.p;
import kf.p0;
import kf.q1;
import kf.q2;
import kf.r;
import kf.r0;
import kf.s1;
import kf.s2;
import kf.t;
import kf.t0;
import kf.u1;
import kf.u2;
import kf.v;
import kf.v0;
import kf.w1;
import kf.w2;
import kf.x;
import kf.x0;
import kf.y1;
import kf.y2;
import kf.z;
import kf.z0;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends a {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(58);
        a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_details_disease, 1);
        sparseIntArray.put(R.layout.activity_di_result, 2);
        sparseIntArray.put(R.layout.activity_diagnose, 3);
        sparseIntArray.put(R.layout.activity_healthy, 4);
        sparseIntArray.put(R.layout.activity_history, 5);
        sparseIntArray.put(R.layout.activity_history_delete_disease, 6);
        sparseIntArray.put(R.layout.activity_history_delete_plant, 7);
        sparseIntArray.put(R.layout.activity_iap, 8);
        sparseIntArray.put(R.layout.activity_language, 9);
        sparseIntArray.put(R.layout.activity_light_meter, 10);
        sparseIntArray.put(R.layout.activity_main, 11);
        sparseIntArray.put(R.layout.activity_my_plant_detail, 12);
        sparseIntArray.put(R.layout.activity_notify_full_screen, 13);
        sparseIntArray.put(R.layout.activity_onboarding, 14);
        sparseIntArray.put(R.layout.activity_plant_disease_detail, 15);
        sparseIntArray.put(R.layout.activity_plant_identifier, 16);
        sparseIntArray.put(R.layout.activity_preview_identify, 17);
        sparseIntArray.put(R.layout.activity_reminder, 18);
        sparseIntArray.put(R.layout.activity_reminder_delete, 19);
        sparseIntArray.put(R.layout.activity_ring, 20);
        sparseIntArray.put(R.layout.activity_search_plant_result, 21);
        sparseIntArray.put(R.layout.activity_setting, 22);
        sparseIntArray.put(R.layout.activity_splash, 23);
        sparseIntArray.put(R.layout.ads_shimmer_native_large, 24);
        sparseIntArray.put(R.layout.ads_shimmer_native_small, 25);
        sparseIntArray.put(R.layout.ads_shimmer_native_small_2, 26);
        sparseIntArray.put(R.layout.bottom_sheet_albums, 27);
        sparseIntArray.put(R.layout.dialog_add_plant, 28);
        sparseIntArray.put(R.layout.dialog_add_remind, 29);
        sparseIntArray.put(R.layout.dialog_choose_sound, 30);
        sparseIntArray.put(R.layout.dialog_confirm_delete_remind, 31);
        sparseIntArray.put(R.layout.dialog_flash_sale, 32);
        sparseIntArray.put(R.layout.dialog_loading, 33);
        sparseIntArray.put(R.layout.dialog_no_internet, 34);
        sparseIntArray.put(R.layout.dialog_rate_app, 35);
        sparseIntArray.put(R.layout.dialog_request_permission, 36);
        sparseIntArray.put(R.layout.dialog_update_remind, 37);
        sparseIntArray.put(R.layout.dialog_upgrade_vip, 38);
        sparseIntArray.put(R.layout.fragment_disease_history, 39);
        sparseIntArray.put(R.layout.fragment_home, 40);
        sparseIntArray.put(R.layout.fragment_my_plant, 41);
        sparseIntArray.put(R.layout.fragment_plant_history, 42);
        sparseIntArray.put(R.layout.item_common_diseases, 43);
        sparseIntArray.put(R.layout.item_common_name, 44);
        sparseIntArray.put(R.layout.item_history, 45);
        sparseIntArray.put(R.layout.item_history_delete, 46);
        sparseIntArray.put(R.layout.item_iap, 47);
        sparseIntArray.put(R.layout.item_image, 48);
        sparseIntArray.put(R.layout.item_image_plant, 49);
        sparseIntArray.put(R.layout.item_indicator, 50);
        sparseIntArray.put(R.layout.item_language, 51);
        sparseIntArray.put(R.layout.item_my_plant, 52);
        sparseIntArray.put(R.layout.item_on_boarding, 53);
        sparseIntArray.put(R.layout.item_plant_disease, 54);
        sparseIntArray.put(R.layout.item_reminder, 55);
        sparseIntArray.put(R.layout.item_reminder_delete, 56);
        sparseIntArray.put(R.layout.item_result_image, 57);
        sparseIntArray.put(R.layout.item_sound, 58);
    }

    @Override // androidx.databinding.a
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.a
    public final e b(View view, int i10) {
        int i11 = a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i12 = (i11 - 1) / 50;
                if (i12 != 0) {
                    if (i12 == 1) {
                        switch (i11) {
                            case 51:
                                if ("layout/item_language_0".equals(tag)) {
                                    return new w2(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_language is invalid. Received: ", tag));
                            case 52:
                                if ("layout/item_my_plant_0".equals(tag)) {
                                    return new y2(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_my_plant is invalid. Received: ", tag));
                            case 53:
                                if ("layout/item_on_boarding_0".equals(tag)) {
                                    return new a3(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_on_boarding is invalid. Received: ", tag));
                            case 54:
                                if ("layout/item_plant_disease_0".equals(tag)) {
                                    return new c3(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_plant_disease is invalid. Received: ", tag));
                            case 55:
                                if ("layout/item_reminder_0".equals(tag)) {
                                    return new e3(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_reminder is invalid. Received: ", tag));
                            case 56:
                                if ("layout/item_reminder_delete_0".equals(tag)) {
                                    return new g3(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_reminder_delete is invalid. Received: ", tag));
                            case 57:
                                if ("layout/item_result_image_0".equals(tag)) {
                                    return new i3(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_result_image is invalid. Received: ", tag));
                            case 58:
                                if ("layout/item_sound_0".equals(tag)) {
                                    return new k3(view);
                                }
                                throw new IllegalArgumentException(j.j("The tag for item_sound is invalid. Received: ", tag));
                            default:
                                return null;
                        }
                    }
                } else {
                    switch (i11) {
                        case 1:
                            if ("layout/activity_details_disease_0".equals(tag)) {
                                return new b(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_details_disease is invalid. Received: ", tag));
                        case 2:
                            if ("layout/activity_di_result_0".equals(tag)) {
                                return new d(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_di_result is invalid. Received: ", tag));
                        case 3:
                            if ("layout/activity_diagnose_0".equals(tag)) {
                                return new f(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_diagnose is invalid. Received: ", tag));
                        case 4:
                            if ("layout/activity_healthy_0".equals(tag)) {
                                return new h(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_healthy is invalid. Received: ", tag));
                        case 5:
                            if ("layout/activity_history_0".equals(tag)) {
                                return new kf.j(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_history is invalid. Received: ", tag));
                        case 6:
                            if ("layout/activity_history_delete_disease_0".equals(tag)) {
                                return new l(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_history_delete_disease is invalid. Received: ", tag));
                        case 7:
                            if ("layout/activity_history_delete_plant_0".equals(tag)) {
                                return new n(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_history_delete_plant is invalid. Received: ", tag));
                        case 8:
                            if ("layout/activity_iap_0".equals(tag)) {
                                return new p(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_iap is invalid. Received: ", tag));
                        case 9:
                            if ("layout/activity_language_0".equals(tag)) {
                                return new r(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_language is invalid. Received: ", tag));
                        case 10:
                            if ("layout/activity_light_meter_0".equals(tag)) {
                                return new t(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_light_meter is invalid. Received: ", tag));
                        case 11:
                            if ("layout/activity_main_0".equals(tag)) {
                                return new v(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_main is invalid. Received: ", tag));
                        case 12:
                            if ("layout/activity_my_plant_detail_0".equals(tag)) {
                                return new x(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_my_plant_detail is invalid. Received: ", tag));
                        case 13:
                            if ("layout/activity_notify_full_screen_0".equals(tag)) {
                                return new z(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_notify_full_screen is invalid. Received: ", tag));
                        case 14:
                            if ("layout/activity_onboarding_0".equals(tag)) {
                                return new b0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_onboarding is invalid. Received: ", tag));
                        case 15:
                            if ("layout/activity_plant_disease_detail_0".equals(tag)) {
                                return new d0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_plant_disease_detail is invalid. Received: ", tag));
                        case 16:
                            if ("layout/activity_plant_identifier_0".equals(tag)) {
                                return new f0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_plant_identifier is invalid. Received: ", tag));
                        case 17:
                            if ("layout/activity_preview_identify_0".equals(tag)) {
                                return new h0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_preview_identify is invalid. Received: ", tag));
                        case 18:
                            if ("layout/activity_reminder_0".equals(tag)) {
                                return new j0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_reminder is invalid. Received: ", tag));
                        case 19:
                            if ("layout/activity_reminder_delete_0".equals(tag)) {
                                return new l0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_reminder_delete is invalid. Received: ", tag));
                        case 20:
                            if ("layout/activity_ring_0".equals(tag)) {
                                return new n0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_ring is invalid. Received: ", tag));
                        case 21:
                            if ("layout/activity_search_plant_result_0".equals(tag)) {
                                return new p0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_search_plant_result is invalid. Received: ", tag));
                        case 22:
                            if ("layout/activity_setting_0".equals(tag)) {
                                return new r0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_setting is invalid. Received: ", tag));
                        case 23:
                            if ("layout/activity_splash_0".equals(tag)) {
                                return new t0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for activity_splash is invalid. Received: ", tag));
                        case 24:
                            if ("layout/ads_shimmer_native_large_0".equals(tag)) {
                                return new v0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for ads_shimmer_native_large is invalid. Received: ", tag));
                        case 25:
                            if ("layout/ads_shimmer_native_small_0".equals(tag)) {
                                return new z0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for ads_shimmer_native_small is invalid. Received: ", tag));
                        case 26:
                            if ("layout/ads_shimmer_native_small_2_0".equals(tag)) {
                                return new x0(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for ads_shimmer_native_small_2 is invalid. Received: ", tag));
                        case 27:
                            if ("layout/bottom_sheet_albums_0".equals(tag)) {
                                return new b1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for bottom_sheet_albums is invalid. Received: ", tag));
                        case 28:
                            if ("layout/dialog_add_plant_0".equals(tag)) {
                                return new d1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_add_plant is invalid. Received: ", tag));
                        case NOTIFICATION_REDIRECT_VALUE:
                            if ("layout/dialog_add_remind_0".equals(tag)) {
                                return new f1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_add_remind is invalid. Received: ", tag));
                        case 30:
                            if ("layout/dialog_choose_sound_0".equals(tag)) {
                                return new h1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_choose_sound is invalid. Received: ", tag));
                        case TEMPLATE_HTML_SIZE_VALUE:
                            if ("layout/dialog_confirm_delete_remind_0".equals(tag)) {
                                return new j1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_confirm_delete_remind is invalid. Received: ", tag));
                        case 32:
                            if ("layout/dialog_flash_sale_0".equals(tag)) {
                                return new l1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_flash_sale is invalid. Received: ", tag));
                        case 33:
                            if ("layout/dialog_loading_0".equals(tag)) {
                                return new m1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_loading is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                            if ("layout/dialog_no_internet_0".equals(tag)) {
                                return new o1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_no_internet is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                            if ("layout/dialog_rate_app_0".equals(tag)) {
                                return new q1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_rate_app is invalid. Received: ", tag));
                        case 36:
                            if ("layout/dialog_request_permission_0".equals(tag)) {
                                return new s1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_request_permission is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                            if ("layout/dialog_update_remind_0".equals(tag)) {
                                return new u1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_update_remind is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            if ("layout/dialog_upgrade_vip_0".equals(tag)) {
                                return new w1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for dialog_upgrade_vip is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                            if ("layout/fragment_disease_history_0".equals(tag)) {
                                return new y1(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for fragment_disease_history is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                            if ("layout/fragment_home_0".equals(tag)) {
                                return new a2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for fragment_home is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                            if ("layout/fragment_my_plant_0".equals(tag)) {
                                return new c2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for fragment_my_plant is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            if ("layout/fragment_plant_history_0".equals(tag)) {
                                return new e2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for fragment_plant_history is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            if ("layout/item_common_diseases_0".equals(tag)) {
                                return new g2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_common_diseases is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                            if ("layout/item_common_name_0".equals(tag)) {
                                return new i2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_common_name is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                            if ("layout/item_history_0".equals(tag)) {
                                return new k2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_history is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            if ("layout/item_history_delete_0".equals(tag)) {
                                return new m2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_history_delete is invalid. Received: ", tag));
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            if ("layout/item_iap_0".equals(tag)) {
                                return new o2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_iap is invalid. Received: ", tag));
                        case 48:
                            if ("layout/item_image_0".equals(tag)) {
                                return new q2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_image is invalid. Received: ", tag));
                        case 49:
                            if ("layout/item_image_plant_0".equals(tag)) {
                                return new s2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_image_plant is invalid. Received: ", tag));
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            if ("layout/item_indicator_0".equals(tag)) {
                                return new u2(view);
                            }
                            throw new IllegalArgumentException(j.j("The tag for item_indicator is invalid. Received: ", tag));
                        default:
                            return null;
                    }
                }
            } else {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final e c(View[] viewArr, int i10) {
        if (viewArr.length != 0 && a.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
