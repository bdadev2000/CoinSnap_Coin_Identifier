package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f15296a;
    private File b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f15297c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f15298d;

    /* renamed from: e, reason: collision with root package name */
    private String f15299e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15300f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15301g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15302h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15303i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15304j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15305k;
    private int l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private int f15306n;

    /* renamed from: o, reason: collision with root package name */
    private int f15307o;

    /* renamed from: p, reason: collision with root package name */
    private int f15308p;

    /* renamed from: q, reason: collision with root package name */
    private int f15309q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f15310r;

    /* loaded from: classes3.dex */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f15311a;
        private File b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f15312c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f15313d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15314e;

        /* renamed from: f, reason: collision with root package name */
        private String f15315f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f15316g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f15317h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f15318i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f15319j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f15320k;
        private int l;
        private int m;

        /* renamed from: n, reason: collision with root package name */
        private int f15321n;

        /* renamed from: o, reason: collision with root package name */
        private int f15322o;

        /* renamed from: p, reason: collision with root package name */
        private int f15323p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f15315f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f15312c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z8) {
            this.f15314e = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i9) {
            this.f15322o = i9;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f15313d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f15311a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z8) {
            this.f15319j = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z8) {
            this.f15317h = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z8) {
            this.f15320k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z8) {
            this.f15316g = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z8) {
            this.f15318i = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i9) {
            this.f15321n = i9;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i9) {
            this.l = i9;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i9) {
            this.m = i9;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i9) {
            this.f15323p = i9;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z8);

        IViewOptionBuilder countDownTime(int i9);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z8);

        IViewOptionBuilder isClickButtonVisible(boolean z8);

        IViewOptionBuilder isLogoVisible(boolean z8);

        IViewOptionBuilder isScreenClick(boolean z8);

        IViewOptionBuilder isShakeVisible(boolean z8);

        IViewOptionBuilder orientation(int i9);

        IViewOptionBuilder shakeStrenght(int i9);

        IViewOptionBuilder shakeTime(int i9);

        IViewOptionBuilder templateType(int i9);
    }

    public DyOption(Builder builder) {
        this.f15296a = builder.f15311a;
        this.b = builder.b;
        this.f15297c = builder.f15312c;
        this.f15298d = builder.f15313d;
        this.f15301g = builder.f15314e;
        this.f15299e = builder.f15315f;
        this.f15300f = builder.f15316g;
        this.f15302h = builder.f15317h;
        this.f15304j = builder.f15319j;
        this.f15303i = builder.f15318i;
        this.f15305k = builder.f15320k;
        this.l = builder.l;
        this.m = builder.m;
        this.f15306n = builder.f15321n;
        this.f15307o = builder.f15322o;
        this.f15309q = builder.f15323p;
    }

    public String getAdChoiceLink() {
        return this.f15299e;
    }

    public CampaignEx getCampaignEx() {
        return this.f15297c;
    }

    public int getCountDownTime() {
        return this.f15307o;
    }

    public int getCurrentCountDown() {
        return this.f15308p;
    }

    public DyAdType getDyAdType() {
        return this.f15298d;
    }

    public File getFile() {
        return this.b;
    }

    public List<String> getFileDirs() {
        return this.f15296a;
    }

    public int getOrientation() {
        return this.f15306n;
    }

    public int getShakeStrenght() {
        return this.l;
    }

    public int getShakeTime() {
        return this.m;
    }

    public int getTemplateType() {
        return this.f15309q;
    }

    public boolean isApkInfoVisible() {
        return this.f15304j;
    }

    public boolean isCanSkip() {
        return this.f15301g;
    }

    public boolean isClickButtonVisible() {
        return this.f15302h;
    }

    public boolean isClickScreen() {
        return this.f15300f;
    }

    public boolean isLogoVisible() {
        return this.f15305k;
    }

    public boolean isShakeVisible() {
        return this.f15303i;
    }

    public void setDyCountDownListener(int i9) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f15310r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i9);
        }
        this.f15308p = i9;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f15310r = dyCountDownListenerWrapper;
    }
}
