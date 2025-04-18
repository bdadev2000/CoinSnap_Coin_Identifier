package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class DyOption {
    private List<String> a;

    /* renamed from: b, reason: collision with root package name */
    private File f12936b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f12937c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f12938d;

    /* renamed from: e, reason: collision with root package name */
    private String f12939e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12940f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12941g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12942h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12943i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12944j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12945k;

    /* renamed from: l, reason: collision with root package name */
    private int f12946l;

    /* renamed from: m, reason: collision with root package name */
    private int f12947m;

    /* renamed from: n, reason: collision with root package name */
    private int f12948n;

    /* renamed from: o, reason: collision with root package name */
    private int f12949o;

    /* renamed from: p, reason: collision with root package name */
    private int f12950p;

    /* renamed from: q, reason: collision with root package name */
    private int f12951q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f12952r;

    /* loaded from: classes4.dex */
    public static class Builder implements IViewOptionBuilder {
        private List<String> a;

        /* renamed from: b, reason: collision with root package name */
        private File f12953b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f12954c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f12955d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12956e;

        /* renamed from: f, reason: collision with root package name */
        private String f12957f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f12958g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f12959h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f12960i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f12961j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f12962k;

        /* renamed from: l, reason: collision with root package name */
        private int f12963l;

        /* renamed from: m, reason: collision with root package name */
        private int f12964m;

        /* renamed from: n, reason: collision with root package name */
        private int f12965n;

        /* renamed from: o, reason: collision with root package name */
        private int f12966o;

        /* renamed from: p, reason: collision with root package name */
        private int f12967p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f12957f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f12954c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f12956e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f12966o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f12955d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f12953b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f12961j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f12959h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f12962k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f12958g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f12960i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f12965n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f12963l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f12964m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f12967p = i10;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.a = builder.a;
        this.f12936b = builder.f12953b;
        this.f12937c = builder.f12954c;
        this.f12938d = builder.f12955d;
        this.f12941g = builder.f12956e;
        this.f12939e = builder.f12957f;
        this.f12940f = builder.f12958g;
        this.f12942h = builder.f12959h;
        this.f12944j = builder.f12961j;
        this.f12943i = builder.f12960i;
        this.f12945k = builder.f12962k;
        this.f12946l = builder.f12963l;
        this.f12947m = builder.f12964m;
        this.f12948n = builder.f12965n;
        this.f12949o = builder.f12966o;
        this.f12951q = builder.f12967p;
    }

    public String getAdChoiceLink() {
        return this.f12939e;
    }

    public CampaignEx getCampaignEx() {
        return this.f12937c;
    }

    public int getCountDownTime() {
        return this.f12949o;
    }

    public int getCurrentCountDown() {
        return this.f12950p;
    }

    public DyAdType getDyAdType() {
        return this.f12938d;
    }

    public File getFile() {
        return this.f12936b;
    }

    public List<String> getFileDirs() {
        return this.a;
    }

    public int getOrientation() {
        return this.f12948n;
    }

    public int getShakeStrenght() {
        return this.f12946l;
    }

    public int getShakeTime() {
        return this.f12947m;
    }

    public int getTemplateType() {
        return this.f12951q;
    }

    public boolean isApkInfoVisible() {
        return this.f12944j;
    }

    public boolean isCanSkip() {
        return this.f12941g;
    }

    public boolean isClickButtonVisible() {
        return this.f12942h;
    }

    public boolean isClickScreen() {
        return this.f12940f;
    }

    public boolean isLogoVisible() {
        return this.f12945k;
    }

    public boolean isShakeVisible() {
        return this.f12943i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f12952r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f12950p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f12952r = dyCountDownListenerWrapper;
    }
}
