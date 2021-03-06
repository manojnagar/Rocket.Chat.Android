package chat.rocket.android.files.di

import chat.rocket.android.files.ui.FilesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FilesFragmentProvider {

    @ContributesAndroidInjector(modules = [FilesFragmentModule::class])
    abstract fun provideFilesFragment(): FilesFragment
}