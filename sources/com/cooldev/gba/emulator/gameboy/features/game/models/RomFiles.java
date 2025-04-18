package com.cooldev.gba.emulator.gameboy.features.game.models;

import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class RomFiles {
    public static final int $stable = 0;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Standard extends RomFiles {
        public static final int $stable = 8;

        @NotNull
        private final List<File> files;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Standard(@NotNull List<? extends File> list) {
            super(null);
            a.s(list, "files");
            this.files = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Standard copy$default(Standard standard, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = standard.files;
            }
            return standard.copy(list);
        }

        @NotNull
        public final List<File> component1() {
            return this.files;
        }

        @NotNull
        public final Standard copy(@NotNull List<? extends File> list) {
            a.s(list, "files");
            return new Standard(list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Standard) && a.g(this.files, ((Standard) obj).files);
        }

        @NotNull
        public final List<File> getFiles() {
            return this.files;
        }

        public int hashCode() {
            return this.files.hashCode();
        }

        @NotNull
        public String toString() {
            return "Standard(files=" + this.files + ')';
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Virtual extends RomFiles {
        public static final int $stable = 8;

        @NotNull
        private final List<Entry> files;

        @StabilityInferred
        /* loaded from: classes3.dex */
        public static final class Entry {
            public static final int $stable = 8;

            @NotNull
            private final ParcelFileDescriptor fd;

            @NotNull
            private final String filePath;

            public Entry(@NotNull String str, @NotNull ParcelFileDescriptor parcelFileDescriptor) {
                a.s(str, "filePath");
                a.s(parcelFileDescriptor, "fd");
                this.filePath = str;
                this.fd = parcelFileDescriptor;
            }

            public static /* synthetic */ Entry copy$default(Entry entry, String str, ParcelFileDescriptor parcelFileDescriptor, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = entry.filePath;
                }
                if ((i2 & 2) != 0) {
                    parcelFileDescriptor = entry.fd;
                }
                return entry.copy(str, parcelFileDescriptor);
            }

            @NotNull
            public final String component1() {
                return this.filePath;
            }

            @NotNull
            public final ParcelFileDescriptor component2() {
                return this.fd;
            }

            @NotNull
            public final Entry copy(@NotNull String str, @NotNull ParcelFileDescriptor parcelFileDescriptor) {
                a.s(str, "filePath");
                a.s(parcelFileDescriptor, "fd");
                return new Entry(str, parcelFileDescriptor);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return a.g(this.filePath, entry.filePath) && a.g(this.fd, entry.fd);
            }

            @NotNull
            public final ParcelFileDescriptor getFd() {
                return this.fd;
            }

            @NotNull
            public final String getFilePath() {
                return this.filePath;
            }

            public int hashCode() {
                return this.fd.hashCode() + (this.filePath.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Entry(filePath=" + this.filePath + ", fd=" + this.fd + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Virtual(@NotNull List<Entry> list) {
            super(null);
            a.s(list, "files");
            this.files = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Virtual copy$default(Virtual virtual, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = virtual.files;
            }
            return virtual.copy(list);
        }

        @NotNull
        public final List<Entry> component1() {
            return this.files;
        }

        @NotNull
        public final Virtual copy(@NotNull List<Entry> list) {
            a.s(list, "files");
            return new Virtual(list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Virtual) && a.g(this.files, ((Virtual) obj).files);
        }

        @NotNull
        public final List<Entry> getFiles() {
            return this.files;
        }

        public int hashCode() {
            return this.files.hashCode();
        }

        @NotNull
        public String toString() {
            return "Virtual(files=" + this.files + ')';
        }
    }

    private RomFiles() {
    }

    public /* synthetic */ RomFiles(k kVar) {
        this();
    }
}
