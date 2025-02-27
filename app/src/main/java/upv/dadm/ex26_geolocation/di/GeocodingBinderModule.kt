/*
 * Copyright (c) 2022-2024 Universitat Politècnica de València
 * Authors: David de Andrés and Juan Carlos Ruiz
 *          Fault-Tolerant Systems
 *          Instituto ITACA
 *          Universitat Politècnica de València
 *
 * Distributed under MIT license
 * (See accompanying file LICENSE.txt)
 */

package upv.dadm.ex26_geolocation.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import upv.dadm.ex26_geolocation.data.geocoding.GeocodingDataSource
import upv.dadm.ex26_geolocation.data.geocoding.GeocodingDataSourceImpl
import upv.dadm.ex26_geolocation.data.geocoding.GeocodingRepository
import upv.dadm.ex26_geolocation.data.geocoding.GeocodingRepositoryImpl
import javax.inject.Singleton

/**
 * Hilt module that determines how to provide required dependencies for interfaces.
 */
@Module
// The Hilt annotation @SingletonComponent creates and destroy instances following the lifecycle of the Application
@InstallIn(SingletonComponent::class)
abstract class GeocodingBinderModule {

    /**
     * Provides an instance of a GeocodingDataSource.
     */
    @Binds
    @Singleton
    abstract fun bindGeocodingDataSource(
        geocodingDataSourceImpl: GeocodingDataSourceImpl
    ): GeocodingDataSource

    /**
     * Provides an instance of a GeocodingRepository.
     */
    @Binds
    @Singleton
    abstract fun bindGeocodingRepository(
        geocodingRepositoryImpl: GeocodingRepositoryImpl
    ): GeocodingRepository

}