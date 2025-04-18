package com.cooldev.gba.emulator.gameboy.features.setting.page;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.setting.enums.SettingEnum;
import com.cooldev.gba.emulator.gameboy.features.setting.logic.SettingViewModel;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class SettingPageKt$SettingPage$1$1$1$1$1 extends r implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ SettingEnum $item;
    final /* synthetic */ SettingViewModel $settingViewModel;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingEnum.values().length];
            try {
                iArr[SettingEnum.Store.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingEnum.Subscription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingEnum.Term.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingEnum.Policy.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingEnum.Email.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingEnum.Review.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SettingEnum.Help.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingPageKt$SettingPage$1$1$1$1$1(SettingEnum settingEnum, SettingViewModel settingViewModel, Context context) {
        super(0);
        this.$item = settingEnum;
        this.$settingViewModel = settingViewModel;
        this.$context = context;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m354invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m354invoke() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.$item.ordinal()]) {
            case 1:
                this.$settingViewModel.onTapStore(this.$context);
                return;
            case 2:
                MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo(RouterName.MANAGE_SUB);
                return;
            case 3:
                this.$settingViewModel.onTapTerm(this.$context);
                return;
            case 4:
                this.$settingViewModel.onTapPolicy(this.$context);
                return;
            case 5:
                this.$settingViewModel.onTapContactUs(this.$context);
                return;
            case 6:
                this.$settingViewModel.onTapRateApp(this.$context);
                return;
            case 7:
                MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo(RouterName.GUIDE);
                return;
            default:
                return;
        }
    }
}
