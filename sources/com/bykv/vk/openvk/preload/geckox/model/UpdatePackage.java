package com.bykv.vk.openvk.preload.geckox.model;

import a4.j;
import com.applovin.sdk.AppLovinEventTypes;
import com.bykv.vk.openvk.preload.a.a.c;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;

/* loaded from: classes.dex */
public class UpdatePackage {
    private String accessKey;

    @c(a = "channel")
    private String channel;

    @c(a = "channel_index")
    private int channelIndex;

    @c(a = AppLovinEventTypes.USER_VIEWED_CONTENT)
    private Content content;

    @c(a = "group_name")
    private String groupName;
    private long localVersion;

    @c(a = "package_type")
    private int packageType;

    @c(a = "package_version")
    private long version;

    /* loaded from: classes.dex */
    public static class Content {

        @c(a = "package")
        private Package fullPackage;

        @c(a = "patch")
        private Package patch;

        @c(a = "strategies")
        private Strategy strategy;
    }

    /* loaded from: classes.dex */
    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    /* loaded from: classes.dex */
    public static class Package {

        /* renamed from: id, reason: collision with root package name */
        @c(a = "id")
        long f10106id;

        @c(a = "size")
        long length;

        @c(a = "md5")
        String md5;

        @Deprecated
        String url;

        @c(a = "url_list")
        List<String> urlList;

        public Package() {
        }

        public long getId() {
            return this.f10106id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i10) {
            this.f10106id = i10;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Package{url='");
            sb2.append(this.url);
            sb2.append("', md5='");
            return e.h(sb2, this.md5, "'}");
        }

        public Package(int i10, List<String> list, String str) {
            this.f10106id = i10;
            this.urlList = list;
            this.md5 = str;
        }
    }

    /* loaded from: classes.dex */
    public static class Strategy {

        @c(a = "del_if_download_failed")
        private boolean deleteIfFail;

        @c(a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;

        @c(a = "need_unzip")
        private boolean needUnzip;

        public Strategy(int i10) {
            this.deleteIfFail = i10 == 1;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z10) {
            this.deleteIfFail = z10;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z10) {
            this.deleteOldPackageBeforeDownload = z10;
        }

        public void setNeedUnzip(boolean z10) {
            this.needUnzip = z10;
        }
    }

    public UpdatePackage() {
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i10) {
        this.channelIndex = i10;
    }

    public void setFullPackage(Package r22) {
        this.content.fullPackage = r22;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j3) {
        this.localVersion = j3;
    }

    public void setPatch(Package r22) {
        this.content.patch = r22;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j3) {
        this.version = j3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdatePackage{version=");
        sb2.append(this.version);
        sb2.append(", channel='");
        sb2.append(this.channel);
        sb2.append("', content=");
        sb2.append(this.content);
        sb2.append(", packageType=");
        return j.i(sb2, this.packageType, AbstractJsonLexerKt.END_OBJ);
    }

    public UpdatePackage(long j3, String str, Package r42, Package r52) {
        this.version = j3;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r42;
        this.content.patch = r52;
    }
}
